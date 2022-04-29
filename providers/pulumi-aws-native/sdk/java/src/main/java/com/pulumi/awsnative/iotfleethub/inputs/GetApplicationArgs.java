// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotfleethub.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationArgs extends InvokeArgs {

    public static final GetApplicationArgs Empty = new GetApplicationArgs();

    /**
     * The ID of the application.
     * 
     */
    @Import(name="applicationId", required=true)
    private String applicationId;

    /**
     * @return The ID of the application.
     * 
     */
    public String applicationId() {
        return this.applicationId;
    }

    private GetApplicationArgs() {}

    private GetApplicationArgs(GetApplicationArgs $) {
        this.applicationId = $.applicationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationArgs $;

        public Builder() {
            $ = new GetApplicationArgs();
        }

        public Builder(GetApplicationArgs defaults) {
            $ = new GetApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The ID of the application.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        public GetApplicationArgs build() {
            $.applicationId = Objects.requireNonNull($.applicationId, "expected parameter 'applicationId' to be non-null");
            return $;
        }
    }

}
