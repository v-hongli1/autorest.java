﻿using System.Globalization;
using AutoRest.Core.Model;
using AutoRest.Java.Azure.Model;
using AutoRest.Java.Model;
using Newtonsoft.Json;
using AutoRest.Java.DanModel;

namespace AutoRest.Java.Azure.Model
{
    public class ResponseJva : ResponseJv
    {
        public ResponseJva()
        {
        }

        public ResponseJva(IModelTypeJv body, IModelTypeJv headers)
            : base(body, headers)
        {
        }

        public MethodJva Parent { get; set; }

        [JsonIgnore]
        public bool IsPagedResponse => Parent.IsPagingNextOperation || Parent.IsPagingOperation;

        [JsonIgnore]
        public override IModelTypeJv BodyClientType
        {
            get
            {
                var bodySequenceType = base.BodyClientType as SequenceTypeJva;
                if (bodySequenceType != null && IsPagedResponse)
                {
                    var result = new SequenceTypeJva
                    {
                        ElementType = bodySequenceType.ElementType,
                        PageImplType = bodySequenceType.PageImplType
                    };
                    DanCodeGenerator.pagedListTypes.Add(result);
                    return result;
                }
                return base.BodyClientType;
            }
        }

        [JsonIgnore]
        public override string GenericBodyClientTypeString
        {
            get
            {
                var bodySequenceType = base.BodyClientType as SequenceTypeJva;
                if (bodySequenceType != null && IsPagedResponse)
                {
                    return string.Format(CultureInfo.InvariantCulture, "PagedList<{0}>", DanCodeGenerator.GetIModelTypeName(bodySequenceType.ElementType));
                }
                return base.GenericBodyClientTypeString;
            }
        }

        [JsonIgnore]
        public override string ServiceFutureGenericParameterString
        {
            get
            {
                var bodySequenceType = base.BodyClientType as SequenceTypeJva;
                if (bodySequenceType != null && IsPagedResponse)
                {
                    return string.Format(CultureInfo.InvariantCulture, "List<{0}>", DanCodeGenerator.GetIModelTypeName(bodySequenceType.ElementType));
                }
                return GenericBodyClientTypeString;
            }
        }

        [JsonIgnore]
        public override string ServiceResponseGenericParameterString
        {
            get
            {
                var bodySequenceType = base.BodyClientType as SequenceTypeJva;
                if (bodySequenceType != null && (IsPagedResponse || Parent.SimulateAsPagingOperation))
                {
                    return string.Format(CultureInfo.InvariantCulture, "Page<{0}>", DanCodeGenerator.GetIModelTypeName(bodySequenceType.ElementType));
                }
                return GenericBodyClientTypeString;
            }
        }

        [JsonIgnore]
        public override string ServiceResponseConcreteParameterString
        {
            get
            {
                var bodySequenceType = base.BodyClientType as SequenceTypeJva;
                if (bodySequenceType != null && (IsPagedResponse || Parent.SimulateAsPagingOperation))
                {
                    return bodySequenceType.PageImplType + "<" + DanCodeGenerator.GetIModelTypeName(bodySequenceType.ElementType) + ">";
                }
                return GenericBodyClientTypeString;
            }
        }

        [JsonIgnore]
        public override string GenericBodyWireTypeString
        {
            get
            {
                var sequenceType = base.BodyClientType as SequenceTypeJva;
                if (sequenceType != null && (IsPagedResponse || Parent.IsPagingNonPollingOperation))
                {
                    return string.Format(CultureInfo.InvariantCulture, "{0}<{1}>", sequenceType.PageImplType, DanCodeGenerator.GetIModelTypeName(sequenceType.ElementType));
                }
                return base.GenericBodyWireTypeString;
            }
        }

        [JsonIgnore]
        public override string ClientCallbackTypeString
        {
            get
            {
                if (Body is SequenceType && IsPagedResponse)
                {
                    return DanCodeGenerator.GetIModelTypeName(BodyClientType);
                }
                return base.ClientCallbackTypeString;
            }
        }
    }
}
