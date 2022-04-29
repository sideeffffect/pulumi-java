// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudscheduler.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobHttpTargetOauthTokenArgs extends ResourceArgs {

    public static final JobHttpTargetOauthTokenArgs Empty = new JobHttpTargetOauthTokenArgs();

    /**
     * OAuth scope to be used for generating OAuth access token. If not specified,
     * &#34;https://www.googleapis.com/auth/cloud-platform&#34; will be used.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return OAuth scope to be used for generating OAuth access token. If not specified,
     * &#34;https://www.googleapis.com/auth/cloud-platform&#34; will be used.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * Service account email to be used for generating OAuth token.
     * The service account must be within the same project as the job.
     * 
     */
    @Import(name="serviceAccountEmail", required=true)
    private Output<String> serviceAccountEmail;

    /**
     * @return Service account email to be used for generating OAuth token.
     * The service account must be within the same project as the job.
     * 
     */
    public Output<String> serviceAccountEmail() {
        return this.serviceAccountEmail;
    }

    private JobHttpTargetOauthTokenArgs() {}

    private JobHttpTargetOauthTokenArgs(JobHttpTargetOauthTokenArgs $) {
        this.scope = $.scope;
        this.serviceAccountEmail = $.serviceAccountEmail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobHttpTargetOauthTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobHttpTargetOauthTokenArgs $;

        public Builder() {
            $ = new JobHttpTargetOauthTokenArgs();
        }

        public Builder(JobHttpTargetOauthTokenArgs defaults) {
            $ = new JobHttpTargetOauthTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scope OAuth scope to be used for generating OAuth access token. If not specified,
         * &#34;https://www.googleapis.com/auth/cloud-platform&#34; will be used.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope OAuth scope to be used for generating OAuth access token. If not specified,
         * &#34;https://www.googleapis.com/auth/cloud-platform&#34; will be used.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param serviceAccountEmail Service account email to be used for generating OAuth token.
         * The service account must be within the same project as the job.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(Output<String> serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        /**
         * @param serviceAccountEmail Service account email to be used for generating OAuth token.
         * The service account must be within the same project as the job.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            return serviceAccountEmail(Output.of(serviceAccountEmail));
        }

        public JobHttpTargetOauthTokenArgs build() {
            $.serviceAccountEmail = Objects.requireNonNull($.serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
            return $;
        }
    }

}
