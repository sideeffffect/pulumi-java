// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotcoredeviceadvisor.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SuiteDefinitionDeviceUnderTestArgs extends ResourceArgs {

    public static final SuiteDefinitionDeviceUnderTestArgs Empty = new SuiteDefinitionDeviceUnderTestArgs();

    @Import(name="certificateArn")
    private @Nullable Output<String> certificateArn;

    public Optional<Output<String>> certificateArn() {
        return Optional.ofNullable(this.certificateArn);
    }

    @Import(name="thingArn")
    private @Nullable Output<String> thingArn;

    public Optional<Output<String>> thingArn() {
        return Optional.ofNullable(this.thingArn);
    }

    private SuiteDefinitionDeviceUnderTestArgs() {}

    private SuiteDefinitionDeviceUnderTestArgs(SuiteDefinitionDeviceUnderTestArgs $) {
        this.certificateArn = $.certificateArn;
        this.thingArn = $.thingArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SuiteDefinitionDeviceUnderTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SuiteDefinitionDeviceUnderTestArgs $;

        public Builder() {
            $ = new SuiteDefinitionDeviceUnderTestArgs();
        }

        public Builder(SuiteDefinitionDeviceUnderTestArgs defaults) {
            $ = new SuiteDefinitionDeviceUnderTestArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            $.certificateArn = certificateArn;
            return this;
        }

        public Builder certificateArn(String certificateArn) {
            return certificateArn(Output.of(certificateArn));
        }

        public Builder thingArn(@Nullable Output<String> thingArn) {
            $.thingArn = thingArn;
            return this;
        }

        public Builder thingArn(String thingArn) {
            return thingArn(Output.of(thingArn));
        }

        public SuiteDefinitionDeviceUnderTestArgs build() {
            return $;
        }
    }

}
