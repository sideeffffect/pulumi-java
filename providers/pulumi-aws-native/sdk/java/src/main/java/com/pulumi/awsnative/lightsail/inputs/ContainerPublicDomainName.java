// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The public domain name to use with the container service, such as example.com and www.example.com.
 * 
 */
public final class ContainerPublicDomainName extends com.pulumi.resources.InvokeArgs {

    public static final ContainerPublicDomainName Empty = new ContainerPublicDomainName();

    @Import(name="certificateName")
      private final @Nullable String certificateName;

    public Optional<String> certificateName() {
        return this.certificateName == null ? Optional.empty() : Optional.ofNullable(this.certificateName);
    }

    /**
     * An object that describes the configuration for the containers of the deployment.
     * 
     */
    @Import(name="domainNames")
      private final @Nullable List<String> domainNames;

    public List<String> domainNames() {
        return this.domainNames == null ? List.of() : this.domainNames;
    }

    public ContainerPublicDomainName(
        @Nullable String certificateName,
        @Nullable List<String> domainNames) {
        this.certificateName = certificateName;
        this.domainNames = domainNames;
    }

    private ContainerPublicDomainName() {
        this.certificateName = null;
        this.domainNames = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPublicDomainName defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateName;
        private @Nullable List<String> domainNames;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPublicDomainName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateName = defaults.certificateName;
    	      this.domainNames = defaults.domainNames;
        }

        public Builder certificateName(@Nullable String certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public Builder domainNames(@Nullable List<String> domainNames) {
            this.domainNames = domainNames;
            return this;
        }
        public Builder domainNames(String... domainNames) {
            return domainNames(List.of(domainNames));
        }        public ContainerPublicDomainName build() {
            return new ContainerPublicDomainName(certificateName, domainNames);
        }
    }
}
