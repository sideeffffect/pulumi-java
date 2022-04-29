// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lookoutmetrics.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetAlertArgs extends InvokeArgs {

    public static final GetAlertArgs Empty = new GetAlertArgs();

    /**
     * ARN assigned to the alert.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return ARN assigned to the alert.
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetAlertArgs() {}

    private GetAlertArgs(GetAlertArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertArgs $;

        public Builder() {
            $ = new GetAlertArgs();
        }

        public Builder(GetAlertArgs defaults) {
            $ = new GetAlertArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN assigned to the alert.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetAlertArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
