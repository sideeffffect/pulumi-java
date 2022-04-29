// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainNameMutualTlsAuthenticationArgs extends ResourceArgs {

    public static final DomainNameMutualTlsAuthenticationArgs Empty = new DomainNameMutualTlsAuthenticationArgs();

    @Import(name="truststoreUri")
    private @Nullable Output<String> truststoreUri;

    public Optional<Output<String>> truststoreUri() {
        return Optional.ofNullable(this.truststoreUri);
    }

    @Import(name="truststoreVersion")
    private @Nullable Output<String> truststoreVersion;

    public Optional<Output<String>> truststoreVersion() {
        return Optional.ofNullable(this.truststoreVersion);
    }

    private DomainNameMutualTlsAuthenticationArgs() {}

    private DomainNameMutualTlsAuthenticationArgs(DomainNameMutualTlsAuthenticationArgs $) {
        this.truststoreUri = $.truststoreUri;
        this.truststoreVersion = $.truststoreVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainNameMutualTlsAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainNameMutualTlsAuthenticationArgs $;

        public Builder() {
            $ = new DomainNameMutualTlsAuthenticationArgs();
        }

        public Builder(DomainNameMutualTlsAuthenticationArgs defaults) {
            $ = new DomainNameMutualTlsAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        public Builder truststoreUri(@Nullable Output<String> truststoreUri) {
            $.truststoreUri = truststoreUri;
            return this;
        }

        public Builder truststoreUri(String truststoreUri) {
            return truststoreUri(Output.of(truststoreUri));
        }

        public Builder truststoreVersion(@Nullable Output<String> truststoreVersion) {
            $.truststoreVersion = truststoreVersion;
            return this;
        }

        public Builder truststoreVersion(String truststoreVersion) {
            return truststoreVersion(Output.of(truststoreVersion));
        }

        public DomainNameMutualTlsAuthenticationArgs build() {
            return $;
        }
    }

}
