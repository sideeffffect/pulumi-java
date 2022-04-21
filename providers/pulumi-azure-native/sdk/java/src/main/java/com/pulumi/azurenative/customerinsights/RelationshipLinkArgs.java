// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights;

import com.pulumi.azurenative.customerinsights.inputs.ParticipantProfilePropertyReferenceArgs;
import com.pulumi.azurenative.customerinsights.inputs.RelationshipLinkFieldMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RelationshipLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final RelationshipLinkArgs Empty = new RelationshipLinkArgs();

    /**
     * Localized descriptions for the Relationship Link.
     * 
     */
    @Import(name="description")
    private @Nullable Output<Map<String,String>> description;

    public Optional<Output<Map<String,String>>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Localized display name for the Relationship Link.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<Map<String,String>> displayName;

    public Optional<Output<Map<String,String>>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private Output<String> hubName;

    public Output<String> hubName() {
        return this.hubName;
    }

    /**
     * The InteractionType associated with the Relationship Link.
     * 
     */
    @Import(name="interactionType", required=true)
    private Output<String> interactionType;

    public Output<String> interactionType() {
        return this.interactionType;
    }

    /**
     * The mappings between Interaction and Relationship fields.
     * 
     */
    @Import(name="mappings")
    private @Nullable Output<List<RelationshipLinkFieldMappingArgs>> mappings;

    public Optional<Output<List<RelationshipLinkFieldMappingArgs>>> mappings() {
        return Optional.ofNullable(this.mappings);
    }

    /**
     * The property references for the Profile of the Relationship.
     * 
     */
    @Import(name="profilePropertyReferences", required=true)
    private Output<List<ParticipantProfilePropertyReferenceArgs>> profilePropertyReferences;

    public Output<List<ParticipantProfilePropertyReferenceArgs>> profilePropertyReferences() {
        return this.profilePropertyReferences;
    }

    /**
     * The property references for the Related Profile of the Relationship.
     * 
     */
    @Import(name="relatedProfilePropertyReferences", required=true)
    private Output<List<ParticipantProfilePropertyReferenceArgs>> relatedProfilePropertyReferences;

    public Output<List<ParticipantProfilePropertyReferenceArgs>> relatedProfilePropertyReferences() {
        return this.relatedProfilePropertyReferences;
    }

    /**
     * The name of the relationship link.
     * 
     */
    @Import(name="relationshipLinkName")
    private @Nullable Output<String> relationshipLinkName;

    public Optional<Output<String>> relationshipLinkName() {
        return Optional.ofNullable(this.relationshipLinkName);
    }

    /**
     * The Relationship associated with the Link.
     * 
     */
    @Import(name="relationshipName", required=true)
    private Output<String> relationshipName;

    public Output<String> relationshipName() {
        return this.relationshipName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private RelationshipLinkArgs() {}

    private RelationshipLinkArgs(RelationshipLinkArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.hubName = $.hubName;
        this.interactionType = $.interactionType;
        this.mappings = $.mappings;
        this.profilePropertyReferences = $.profilePropertyReferences;
        this.relatedProfilePropertyReferences = $.relatedProfilePropertyReferences;
        this.relationshipLinkName = $.relationshipLinkName;
        this.relationshipName = $.relationshipName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RelationshipLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RelationshipLinkArgs $;

        public Builder() {
            $ = new RelationshipLinkArgs();
        }

        public Builder(RelationshipLinkArgs defaults) {
            $ = new RelationshipLinkArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<Map<String,String>> description) {
            $.description = description;
            return this;
        }

        public Builder description(Map<String,String> description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<Map<String,String>> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(Map<String,String> displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder hubName(Output<String> hubName) {
            $.hubName = hubName;
            return this;
        }

        public Builder hubName(String hubName) {
            return hubName(Output.of(hubName));
        }

        public Builder interactionType(Output<String> interactionType) {
            $.interactionType = interactionType;
            return this;
        }

        public Builder interactionType(String interactionType) {
            return interactionType(Output.of(interactionType));
        }

        public Builder mappings(@Nullable Output<List<RelationshipLinkFieldMappingArgs>> mappings) {
            $.mappings = mappings;
            return this;
        }

        public Builder mappings(List<RelationshipLinkFieldMappingArgs> mappings) {
            return mappings(Output.of(mappings));
        }

        public Builder mappings(RelationshipLinkFieldMappingArgs... mappings) {
            return mappings(List.of(mappings));
        }

        public Builder profilePropertyReferences(Output<List<ParticipantProfilePropertyReferenceArgs>> profilePropertyReferences) {
            $.profilePropertyReferences = profilePropertyReferences;
            return this;
        }

        public Builder profilePropertyReferences(List<ParticipantProfilePropertyReferenceArgs> profilePropertyReferences) {
            return profilePropertyReferences(Output.of(profilePropertyReferences));
        }

        public Builder profilePropertyReferences(ParticipantProfilePropertyReferenceArgs... profilePropertyReferences) {
            return profilePropertyReferences(List.of(profilePropertyReferences));
        }

        public Builder relatedProfilePropertyReferences(Output<List<ParticipantProfilePropertyReferenceArgs>> relatedProfilePropertyReferences) {
            $.relatedProfilePropertyReferences = relatedProfilePropertyReferences;
            return this;
        }

        public Builder relatedProfilePropertyReferences(List<ParticipantProfilePropertyReferenceArgs> relatedProfilePropertyReferences) {
            return relatedProfilePropertyReferences(Output.of(relatedProfilePropertyReferences));
        }

        public Builder relatedProfilePropertyReferences(ParticipantProfilePropertyReferenceArgs... relatedProfilePropertyReferences) {
            return relatedProfilePropertyReferences(List.of(relatedProfilePropertyReferences));
        }

        public Builder relationshipLinkName(@Nullable Output<String> relationshipLinkName) {
            $.relationshipLinkName = relationshipLinkName;
            return this;
        }

        public Builder relationshipLinkName(String relationshipLinkName) {
            return relationshipLinkName(Output.of(relationshipLinkName));
        }

        public Builder relationshipName(Output<String> relationshipName) {
            $.relationshipName = relationshipName;
            return this;
        }

        public Builder relationshipName(String relationshipName) {
            return relationshipName(Output.of(relationshipName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public RelationshipLinkArgs build() {
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.interactionType = Objects.requireNonNull($.interactionType, "expected parameter 'interactionType' to be non-null");
            $.profilePropertyReferences = Objects.requireNonNull($.profilePropertyReferences, "expected parameter 'profilePropertyReferences' to be non-null");
            $.relatedProfilePropertyReferences = Objects.requireNonNull($.relatedProfilePropertyReferences, "expected parameter 'relatedProfilePropertyReferences' to be non-null");
            $.relationshipName = Objects.requireNonNull($.relationshipName, "expected parameter 'relationshipName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
