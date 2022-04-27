// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.generated;

import com.azure.core.util.BinaryData;
import fixtures.bodycomplex.models.Fish;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FishTests {
    @Test
    public void testDeserialize() {
        Fish model =
                BinaryData.fromString(
                                "{\"fishtype\":\"Fish\",\"species\":\"k\",\"length\":32.04869,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"ccsnhsjc\",\"length\":26.373684,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"kryhtnapczwlokj\",\"length\":68.2114,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"vnipjox\",\"length\":40.86501,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"gejspodmailzyde\",\"length\":1.213932,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"ahuxinpm\",\"length\":69.22819,\"siblings\":[]}]}]},{\"fishtype\":\"Fish\",\"species\":\"wixjsprozvcp\",\"length\":49.213947,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"vwmf\",\"length\":36.996067,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"mdvpjhulsu\",\"length\":95.65916,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"ozkrwfndiodjpslw\",\"length\":47.227184,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"wryoqpsoacc\",\"length\":29.927517,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"ljlahbcryf\",\"length\":62.317204,\"siblings\":[]}]}]},{\"fishtype\":\"Fish\",\"species\":\"sy\",\"length\":22.420252,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"ojakhmsbzjhcrze\",\"length\":56.24697,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"xaolth\",\"length\":13.468599,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"jbp\",\"length\":55.120502,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"n\",\"length\":25.12173,\"siblings\":[]}]},{\"fishtype\":\"Fish\",\"species\":\"jrwzox\",\"length\":2.6165128,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"lluwfzitonpeq\",\"length\":68.49165,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"lxofpdvhpfxxypin\",\"length\":50.17625,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"huyb\",\"length\":27.761627,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"epoo\",\"length\":72.26112,\"siblings\":[]}]},{\"fishtype\":\"Fish\",\"species\":\"amiheognarxz\",\"length\":54.27655,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"tusivyevcciqihn\",\"length\":9.845084,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"wjzrnfygxgisp\",\"length\":59.519714,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"fkufublj\",\"length\":34.64574,\"siblings\":[]}]},{\"fishtype\":\"Fish\",\"species\":\"ofjaeqjhqjb\",\"length\":0.13743639,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"mjqulngsn\",\"length\":75.88975,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"kzgcwrwcl\",\"length\":99.26511,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"jdous\",\"length\":84.4235,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"ocrcjdk\",\"length\":31.270414,\"siblings\":[]}]}]}]}")
                        .toObject(Fish.class);
        Assertions.assertEquals("k", model.getSpecies());
        Assertions.assertEquals(32.04869f, model.getLength());
        Assertions.assertEquals("ccsnhsjc", model.getSiblings().get(0).getSpecies());
        Assertions.assertEquals(26.373684f, model.getSiblings().get(0).getLength());
        Assertions.assertEquals("kryhtnapczwlokj", model.getSiblings().get(0).getSiblings().get(0).getSpecies());
        Assertions.assertEquals(68.2114f, model.getSiblings().get(0).getSiblings().get(0).getLength());
        Assertions.assertEquals(
                "vnipjox", model.getSiblings().get(0).getSiblings().get(0).getSiblings().get(0).getSpecies());
        Assertions.assertEquals(
                40.86501f, model.getSiblings().get(0).getSiblings().get(0).getSiblings().get(0).getLength());
    }

    @Test
    public void testSerialize() {
        Fish model =
                new Fish(32.04869f)
                        .setSpecies("k")
                        .setSiblings(
                                Arrays.asList(
                                        new Fish(26.373684f)
                                                .setSpecies("ccsnhsjc")
                                                .setSiblings(
                                                        Arrays.asList(
                                                                new Fish(68.2114f)
                                                                        .setSpecies("kryhtnapczwlokj")
                                                                        .setSiblings(
                                                                                Arrays.asList(
                                                                                        new Fish(40.86501f)
                                                                                                .setSpecies("vnipjox")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(1.213932f)
                                                                                                .setSpecies(
                                                                                                        "gejspodmailzyde")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(69.22819f)
                                                                                                .setSpecies("ahuxinpm")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()))))),
                                        new Fish(49.213947f)
                                                .setSpecies("wixjsprozvcp")
                                                .setSiblings(
                                                        Arrays.asList(
                                                                new Fish(36.996067f)
                                                                        .setSpecies("vwmf")
                                                                        .setSiblings(
                                                                                Arrays.asList(
                                                                                        new Fish(95.65916f)
                                                                                                .setSpecies(
                                                                                                        "mdvpjhulsu")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(47.227184f)
                                                                                                .setSpecies(
                                                                                                        "ozkrwfndiodjpslw")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(29.927517f)
                                                                                                .setSpecies(
                                                                                                        "wryoqpsoacc")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(62.317204f)
                                                                                                .setSpecies(
                                                                                                        "ljlahbcryf")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()))))),
                                        new Fish(22.420252f)
                                                .setSpecies("sy")
                                                .setSiblings(
                                                        Arrays.asList(
                                                                new Fish(56.24697f)
                                                                        .setSpecies("ojakhmsbzjhcrze")
                                                                        .setSiblings(
                                                                                Arrays.asList(
                                                                                        new Fish(13.468599f)
                                                                                                .setSpecies("xaolth")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(55.120502f)
                                                                                                .setSpecies("jbp")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(25.12173f)
                                                                                                .setSpecies("n")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()))),
                                                                new Fish(2.6165128f)
                                                                        .setSpecies("jrwzox")
                                                                        .setSiblings(
                                                                                Arrays.asList(
                                                                                        new Fish(68.49165f)
                                                                                                .setSpecies(
                                                                                                        "lluwfzitonpeq")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(50.17625f)
                                                                                                .setSpecies(
                                                                                                        "lxofpdvhpfxxypin")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(27.761627f)
                                                                                                .setSpecies("huyb")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(72.26112f)
                                                                                                .setSpecies("epoo")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()))),
                                                                new Fish(54.27655f)
                                                                        .setSpecies("amiheognarxz")
                                                                        .setSiblings(
                                                                                Arrays.asList(
                                                                                        new Fish(9.845084f)
                                                                                                .setSpecies(
                                                                                                        "tusivyevcciqihn")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(59.519714f)
                                                                                                .setSpecies(
                                                                                                        "wjzrnfygxgisp")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(34.64574f)
                                                                                                .setSpecies("fkufublj")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()))),
                                                                new Fish(0.13743639f)
                                                                        .setSpecies("ofjaeqjhqjb")
                                                                        .setSiblings(
                                                                                Arrays.asList(
                                                                                        new Fish(75.88975f)
                                                                                                .setSpecies("mjqulngsn")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(99.26511f)
                                                                                                .setSpecies("kzgcwrwcl")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(84.4235f)
                                                                                                .setSpecies("jdous")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList()),
                                                                                        new Fish(31.270414f)
                                                                                                .setSpecies("ocrcjdk")
                                                                                                .setSiblings(
                                                                                                        Arrays
                                                                                                                .asList())))))));
        model = BinaryData.fromObject(model).toObject(Fish.class);
        Assertions.assertEquals("k", model.getSpecies());
        Assertions.assertEquals(32.04869f, model.getLength());
        Assertions.assertEquals("ccsnhsjc", model.getSiblings().get(0).getSpecies());
        Assertions.assertEquals(26.373684f, model.getSiblings().get(0).getLength());
        Assertions.assertEquals("kryhtnapczwlokj", model.getSiblings().get(0).getSiblings().get(0).getSpecies());
        Assertions.assertEquals(68.2114f, model.getSiblings().get(0).getSiblings().get(0).getLength());
        Assertions.assertEquals(
                "vnipjox", model.getSiblings().get(0).getSiblings().get(0).getSiblings().get(0).getSpecies());
        Assertions.assertEquals(
                40.86501f, model.getSiblings().get(0).getSiblings().get(0).getSiblings().get(0).getLength());
    }
}