// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appsync.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDomainNameResult {
    private final @Nullable String appSyncDomainName;
    private final @Nullable String description;
    private final @Nullable String hostedZoneId;

    @OutputCustomType.Constructor
    private GetDomainNameResult(
        @OutputCustomType.Parameter("appSyncDomainName") @Nullable String appSyncDomainName,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("hostedZoneId") @Nullable String hostedZoneId) {
        this.appSyncDomainName = appSyncDomainName;
        this.description = description;
        this.hostedZoneId = hostedZoneId;
    }

    public Optional<String> getAppSyncDomainName() {
        return Optional.ofNullable(this.appSyncDomainName);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getHostedZoneId() {
        return Optional.ofNullable(this.hostedZoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainNameResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appSyncDomainName;
        private @Nullable String description;
        private @Nullable String hostedZoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainNameResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSyncDomainName = defaults.appSyncDomainName;
    	      this.description = defaults.description;
    	      this.hostedZoneId = defaults.hostedZoneId;
        }

        public Builder appSyncDomainName(@Nullable String appSyncDomainName) {
            this.appSyncDomainName = appSyncDomainName;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder hostedZoneId(@Nullable String hostedZoneId) {
            this.hostedZoneId = hostedZoneId;
            return this;
        }
        public GetDomainNameResult build() {
            return new GetDomainNameResult(appSyncDomainName, description, hostedZoneId);
        }
    }
}
