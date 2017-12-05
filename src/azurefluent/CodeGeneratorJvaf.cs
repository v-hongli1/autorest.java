// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using AutoRest.Core;
using AutoRest.Core.Model;
using AutoRest.Java.azure.Templates;
using System.Threading.Tasks;

namespace AutoRest.Java.Azure.Fluent
{
    public class CodeGeneratorJvaf : CodeGeneratorJva
    {
        /// <summary>
        /// Generates C# code for service client.
        /// </summary>
        /// <param name="serviceClient"></param>
        /// <returns></returns>
        public override async Task Generate(CodeModel codeModel)
        {
            // Service client
            await WriteAzureServiceClientJavaFile(codeModel).ConfigureAwait(false);

            // operations
            await WriteOperationJavaFiles(codeModel).ConfigureAwait(false);

            //Models
            await WriteModelJavaFiles(codeModel).ConfigureAwait(false);

            //XML wrappers
            await WriteXmlWrapperJavaFiles(codeModel).ConfigureAwait(false);

            //Enums
            await WriteEnumJavaFiles(codeModel).ConfigureAwait(false);

            // Page class
            await WritePageJavaFiles(codeModel).ConfigureAwait(false);

            // Exceptions
            await WriteExceptionJavaFiles(codeModel).ConfigureAwait(false);

            // package-info.java
            await WritePackageInfoJavaFiles(codeModel, new[] { "", "implementation" }).ConfigureAwait(false);

            if (true == Settings.Instance.Host?.GetValue<bool?>("regenerate-manager").Result)
            {
                // Manager
                await WriteAzureServiceManagerJavaFile(codeModel).ConfigureAwait(false);
            }

            if (true == Settings.Instance.Host?.GetValue<bool?>("regenerate-pom").Result)
            { 
                // POM
                await Write(new AzurePomTemplate { Model = codeModel }, "pom.xml");
            }
        }
    }
}
