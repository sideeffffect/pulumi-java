// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.customerprofiles.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IntegrationMarketoSourcePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationMarketoSourcePropertiesArgs Empty = new IntegrationMarketoSourcePropertiesArgs();

    @Import(name="object", required=true)
    private Output<String> object;

    public Output<String> object() {
        return this.object;
    }

    private IntegrationMarketoSourcePropertiesArgs() {}

    private IntegrationMarketoSourcePropertiesArgs(IntegrationMarketoSourcePropertiesArgs $) {
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationMarketoSourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationMarketoSourcePropertiesArgs $;

        public Builder() {
            $ = new IntegrationMarketoSourcePropertiesArgs();
        }

        public Builder(IntegrationMarketoSourcePropertiesArgs defaults) {
            $ = new IntegrationMarketoSourcePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder object(Output<String> object) {
            $.object = object;
            return this;
        }

        public Builder object(String object) {
            return object(Output.of(object));
        }

        public IntegrationMarketoSourcePropertiesArgs build() {
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}
