// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.azurenative.customerinsights.enums.LinkTypes;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The fields mapping for Relationships.
 * 
 */
public final class RelationshipLinkFieldMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final RelationshipLinkFieldMappingArgs Empty = new RelationshipLinkFieldMappingArgs();

    /**
     * The field name on the Interaction Type.
     * 
     */
    @InputImport(name="interactionFieldName", required=true)
      private final Input<String> interactionFieldName;

    public Input<String> getInteractionFieldName() {
        return this.interactionFieldName;
    }

    /**
     * Link type.
     * 
     */
    @InputImport(name="linkType")
      private final @Nullable Input<LinkTypes> linkType;

    public Input<LinkTypes> getLinkType() {
        return this.linkType == null ? Input.empty() : this.linkType;
    }

    /**
     * The field name on the Relationship metadata.
     * 
     */
    @InputImport(name="relationshipFieldName", required=true)
      private final Input<String> relationshipFieldName;

    public Input<String> getRelationshipFieldName() {
        return this.relationshipFieldName;
    }

    public RelationshipLinkFieldMappingArgs(
        Input<String> interactionFieldName,
        @Nullable Input<LinkTypes> linkType,
        Input<String> relationshipFieldName) {
        this.interactionFieldName = Objects.requireNonNull(interactionFieldName, "expected parameter 'interactionFieldName' to be non-null");
        this.linkType = linkType;
        this.relationshipFieldName = Objects.requireNonNull(relationshipFieldName, "expected parameter 'relationshipFieldName' to be non-null");
    }

    private RelationshipLinkFieldMappingArgs() {
        this.interactionFieldName = Input.empty();
        this.linkType = Input.empty();
        this.relationshipFieldName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipLinkFieldMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> interactionFieldName;
        private @Nullable Input<LinkTypes> linkType;
        private Input<String> relationshipFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipLinkFieldMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interactionFieldName = defaults.interactionFieldName;
    	      this.linkType = defaults.linkType;
    	      this.relationshipFieldName = defaults.relationshipFieldName;
        }

        public Builder interactionFieldName(Input<String> interactionFieldName) {
            this.interactionFieldName = Objects.requireNonNull(interactionFieldName);
            return this;
        }

        public Builder interactionFieldName(String interactionFieldName) {
            this.interactionFieldName = Input.of(Objects.requireNonNull(interactionFieldName));
            return this;
        }

        public Builder linkType(@Nullable Input<LinkTypes> linkType) {
            this.linkType = linkType;
            return this;
        }

        public Builder linkType(@Nullable LinkTypes linkType) {
            this.linkType = Input.ofNullable(linkType);
            return this;
        }

        public Builder relationshipFieldName(Input<String> relationshipFieldName) {
            this.relationshipFieldName = Objects.requireNonNull(relationshipFieldName);
            return this;
        }

        public Builder relationshipFieldName(String relationshipFieldName) {
            this.relationshipFieldName = Input.of(Objects.requireNonNull(relationshipFieldName));
            return this;
        }
        public RelationshipLinkFieldMappingArgs build() {
            return new RelationshipLinkFieldMappingArgs(interactionFieldName, linkType, relationshipFieldName);
        }
    }
}
