// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inspectorv2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetFilterArgs extends InvokeArgs {

    public static final GetFilterArgs Empty = new GetFilterArgs();

    /**
     * Findings filter ARN.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return Findings filter ARN.
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetFilterArgs() {}

    private GetFilterArgs(GetFilterArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFilterArgs $;

        public Builder() {
            $ = new GetFilterArgs();
        }

        public Builder(GetFilterArgs defaults) {
            $ = new GetFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Findings filter ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetFilterArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
