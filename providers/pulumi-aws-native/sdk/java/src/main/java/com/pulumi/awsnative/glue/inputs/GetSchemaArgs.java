// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSchemaArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaArgs Empty = new GetSchemaArgs();

    /**
     * Amazon Resource Name for the Schema.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return Amazon Resource Name for the Schema.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    private GetSchemaArgs() {}

    private GetSchemaArgs(GetSchemaArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaArgs $;

        public Builder() {
            $ = new GetSchemaArgs();
        }

        public Builder(GetSchemaArgs defaults) {
            $ = new GetSchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name for the Schema.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name for the Schema.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetSchemaArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
