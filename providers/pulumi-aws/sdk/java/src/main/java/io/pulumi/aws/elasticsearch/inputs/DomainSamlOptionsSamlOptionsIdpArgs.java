// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DomainSamlOptionsSamlOptionsIdpArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainSamlOptionsSamlOptionsIdpArgs Empty = new DomainSamlOptionsSamlOptionsIdpArgs();

    /**
     * The unique Entity ID of the application in SAML Identity Provider.
     * 
     */
    @InputImport(name="entityId", required=true)
      private final Input<String> entityId;

    public Input<String> getEntityId() {
        return this.entityId;
    }

    /**
     * The Metadata of the SAML application in xml format.
     * 
     */
    @InputImport(name="metadataContent", required=true)
      private final Input<String> metadataContent;

    public Input<String> getMetadataContent() {
        return this.metadataContent;
    }

    public DomainSamlOptionsSamlOptionsIdpArgs(
        Input<String> entityId,
        Input<String> metadataContent) {
        this.entityId = Objects.requireNonNull(entityId, "expected parameter 'entityId' to be non-null");
        this.metadataContent = Objects.requireNonNull(metadataContent, "expected parameter 'metadataContent' to be non-null");
    }

    private DomainSamlOptionsSamlOptionsIdpArgs() {
        this.entityId = Input.empty();
        this.metadataContent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainSamlOptionsSamlOptionsIdpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> entityId;
        private Input<String> metadataContent;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainSamlOptionsSamlOptionsIdpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityId = defaults.entityId;
    	      this.metadataContent = defaults.metadataContent;
        }

        public Builder entityId(Input<String> entityId) {
            this.entityId = Objects.requireNonNull(entityId);
            return this;
        }

        public Builder entityId(String entityId) {
            this.entityId = Input.of(Objects.requireNonNull(entityId));
            return this;
        }

        public Builder metadataContent(Input<String> metadataContent) {
            this.metadataContent = Objects.requireNonNull(metadataContent);
            return this;
        }

        public Builder metadataContent(String metadataContent) {
            this.metadataContent = Input.of(Objects.requireNonNull(metadataContent));
            return this;
        }
        public DomainSamlOptionsSamlOptionsIdpArgs build() {
            return new DomainSamlOptionsSamlOptionsIdpArgs(entityId, metadataContent);
        }
    }
}
