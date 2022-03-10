// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobHttpTargetOidcToken {
    /**
     * Audience to be used when generating OIDC token. If not specified,
     * the URI specified in target will be used.
     * 
     */
    private final @Nullable String audience;
    /**
     * Service account email to be used for generating OAuth token.
     * The service account must be within the same project as the job.
     * 
     */
    private final String serviceAccountEmail;

    @OutputCustomType.Constructor
    private JobHttpTargetOidcToken(
        @OutputCustomType.Parameter("audience") @Nullable String audience,
        @OutputCustomType.Parameter("serviceAccountEmail") String serviceAccountEmail) {
        this.audience = audience;
        this.serviceAccountEmail = serviceAccountEmail;
    }

    /**
     * Audience to be used when generating OIDC token. If not specified,
     * the URI specified in target will be used.
     * 
    */
    public Optional<String> getAudience() {
        return Optional.ofNullable(this.audience);
    }
    /**
     * Service account email to be used for generating OAuth token.
     * The service account must be within the same project as the job.
     * 
    */
    public String getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobHttpTargetOidcToken defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String audience;
        private String serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(JobHttpTargetOidcToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder audience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }

        public Builder serviceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }
        public JobHttpTargetOidcToken build() {
            return new JobHttpTargetOidcToken(audience, serviceAccountEmail);
        }
    }
}
