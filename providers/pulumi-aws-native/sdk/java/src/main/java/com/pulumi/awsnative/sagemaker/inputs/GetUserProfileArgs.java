// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetUserProfileArgs extends InvokeArgs {

    public static final GetUserProfileArgs Empty = new GetUserProfileArgs();

    /**
     * The ID of the associated Domain.
     * 
     */
    @Import(name="domainId", required=true)
    private String domainId;

    /**
     * @return The ID of the associated Domain.
     * 
     */
    public String domainId() {
        return this.domainId;
    }

    /**
     * A name for the UserProfile.
     * 
     */
    @Import(name="userProfileName", required=true)
    private String userProfileName;

    /**
     * @return A name for the UserProfile.
     * 
     */
    public String userProfileName() {
        return this.userProfileName;
    }

    private GetUserProfileArgs() {}

    private GetUserProfileArgs(GetUserProfileArgs $) {
        this.domainId = $.domainId;
        this.userProfileName = $.userProfileName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserProfileArgs $;

        public Builder() {
            $ = new GetUserProfileArgs();
        }

        public Builder(GetUserProfileArgs defaults) {
            $ = new GetUserProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainId The ID of the associated Domain.
         * 
         * @return builder
         * 
         */
        public Builder domainId(String domainId) {
            $.domainId = domainId;
            return this;
        }

        /**
         * @param userProfileName A name for the UserProfile.
         * 
         * @return builder
         * 
         */
        public Builder userProfileName(String userProfileName) {
            $.userProfileName = userProfileName;
            return this;
        }

        public GetUserProfileArgs build() {
            $.domainId = Objects.requireNonNull($.domainId, "expected parameter 'domainId' to be non-null");
            $.userProfileName = Objects.requireNonNull($.userProfileName, "expected parameter 'userProfileName' to be non-null");
            return $;
        }
    }

}
