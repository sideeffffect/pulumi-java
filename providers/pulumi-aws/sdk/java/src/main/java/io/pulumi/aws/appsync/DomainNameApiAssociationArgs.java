// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DomainNameApiAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainNameApiAssociationArgs Empty = new DomainNameApiAssociationArgs();

    /**
     * The API ID.
     * 
     */
    @InputImport(name="apiId", required=true)
      private final Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId;
    }

    /**
     * The Appsync domain name.
     * 
     */
    @InputImport(name="domainName", required=true)
      private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    public DomainNameApiAssociationArgs(
        Input<String> apiId,
        Input<String> domainName) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
    }

    private DomainNameApiAssociationArgs() {
        this.apiId = Input.empty();
        this.domainName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameApiAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiId;
        private Input<String> domainName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameApiAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.domainName = defaults.domainName;
        }

        public Builder apiId(Input<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder apiId(String apiId) {
            this.apiId = Input.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder domainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder domainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }
        public DomainNameApiAssociationArgs build() {
            return new DomainNameApiAssociationArgs(apiId, domainName);
        }
    }
}
