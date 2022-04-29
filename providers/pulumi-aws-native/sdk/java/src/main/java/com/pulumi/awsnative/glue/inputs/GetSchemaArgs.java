// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.glue.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetSchemaArgs extends InvokeArgs {

    public static final GetSchemaArgs Empty = new GetSchemaArgs();

    /**
     * Amazon Resource Name for the Schema.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return Amazon Resource Name for the Schema.
     * 
     */
    public String arn() {
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
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetSchemaArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
