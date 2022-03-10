// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An attribute value for a Consent or User data mapping. Each Attribute must have a corresponding AttributeDefinition in the consent store that defines the default and allowed values.
 * 
 */
public final class AttributeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttributeArgs Empty = new AttributeArgs();

    /**
     * Indicates the name of an attribute defined in the consent store.
     * 
     */
    @InputImport(name="attributeDefinitionId")
      private final @Nullable Input<String> attributeDefinitionId;

    public Input<String> getAttributeDefinitionId() {
        return this.attributeDefinitionId == null ? Input.empty() : this.attributeDefinitionId;
    }

    /**
     * The value of the attribute. Must be an acceptable value as defined in the consent store. For example, if the consent store defines "data type" with acceptable values "questionnaire" and "step-count", when the attribute name is data type, this field must contain one of those values.
     * 
     */
    @InputImport(name="values")
      private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public AttributeArgs(
        @Nullable Input<String> attributeDefinitionId,
        @Nullable Input<List<String>> values) {
        this.attributeDefinitionId = attributeDefinitionId;
        this.values = values;
    }

    private AttributeArgs() {
        this.attributeDefinitionId = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> attributeDefinitionId;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(AttributeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeDefinitionId = defaults.attributeDefinitionId;
    	      this.values = defaults.values;
        }

        public Builder attributeDefinitionId(@Nullable Input<String> attributeDefinitionId) {
            this.attributeDefinitionId = attributeDefinitionId;
            return this;
        }

        public Builder attributeDefinitionId(@Nullable String attributeDefinitionId) {
            this.attributeDefinitionId = Input.ofNullable(attributeDefinitionId);
            return this;
        }

        public Builder values(@Nullable Input<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }
        public AttributeArgs build() {
            return new AttributeArgs(attributeDefinitionId, values);
        }
    }
}
