// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.datacatalog.outputs.TagTemplateFieldType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TagTemplateField {
    /**
     * A description for this field.
     * 
     */
    private final @Nullable String description;
    /**
     * The display name for this template.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The identifier for this object. Format specified above.
     * 
     */
    private final String fieldId;
    /**
     * Whether this is a required field. Defaults to false.
     * 
     */
    private final @Nullable Boolean isRequired;
    /**
     * - 
     * The resource name of the tag template field in URL format. Example: projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}/fields/{field}
     * 
     */
    private final @Nullable String name;
    /**
     * The order of this field with respect to other fields in this tag template.
     * A higher value indicates a more important field. The value can be negative.
     * Multiple fields can have the same order, and field orders within a tag do not have to be sequential.
     * 
     */
    private final @Nullable Integer order;
    /**
     * The type of value this tag field can contain.
     * Structure is documented below.
     * 
     */
    private final TagTemplateFieldType type;

    @OutputCustomType.Constructor
    private TagTemplateField(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("displayName") @Nullable String displayName,
        @OutputCustomType.Parameter("fieldId") String fieldId,
        @OutputCustomType.Parameter("isRequired") @Nullable Boolean isRequired,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("order") @Nullable Integer order,
        @OutputCustomType.Parameter("type") TagTemplateFieldType type) {
        this.description = description;
        this.displayName = displayName;
        this.fieldId = fieldId;
        this.isRequired = isRequired;
        this.name = name;
        this.order = order;
        this.type = type;
    }

    /**
     * A description for this field.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The display name for this template.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The identifier for this object. Format specified above.
     * 
    */
    public String getFieldId() {
        return this.fieldId;
    }
    /**
     * Whether this is a required field. Defaults to false.
     * 
    */
    public Optional<Boolean> getIsRequired() {
        return Optional.ofNullable(this.isRequired);
    }
    /**
     * - 
     * The resource name of the tag template field in URL format. Example: projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}/fields/{field}
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The order of this field with respect to other fields in this tag template.
     * A higher value indicates a more important field. The value can be negative.
     * Multiple fields can have the same order, and field orders within a tag do not have to be sequential.
     * 
    */
    public Optional<Integer> getOrder() {
        return Optional.ofNullable(this.order);
    }
    /**
     * The type of value this tag field can contain.
     * Structure is documented below.
     * 
    */
    public TagTemplateFieldType getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateField defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String displayName;
        private String fieldId;
        private @Nullable Boolean isRequired;
        private @Nullable String name;
        private @Nullable Integer order;
        private TagTemplateFieldType type;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.fieldId = defaults.fieldId;
    	      this.isRequired = defaults.isRequired;
    	      this.name = defaults.name;
    	      this.order = defaults.order;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder fieldId(String fieldId) {
            this.fieldId = Objects.requireNonNull(fieldId);
            return this;
        }

        public Builder isRequired(@Nullable Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder order(@Nullable Integer order) {
            this.order = order;
            return this;
        }

        public Builder type(TagTemplateFieldType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TagTemplateField build() {
            return new TagTemplateField(description, displayName, fieldId, isRequired, name, order, type);
        }
    }
}
