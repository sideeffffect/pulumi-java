// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.FlavorDataArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Model asset version details.
 * 
 */
public final class ModelVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelVersionArgs Empty = new ModelVersionArgs();

    /**
     * ARM resource ID of the datastore where the asset is located.
     * 
     */
    @InputImport(name="datastoreId")
      private final @Nullable Input<String> datastoreId;

    public Input<String> getDatastoreId() {
        return this.datastoreId == null ? Input.empty() : this.datastoreId;
    }

    /**
     * The asset description text.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Mapping of model flavors to their properties.
     * 
     */
    @InputImport(name="flavors")
      private final @Nullable Input<Map<String,FlavorDataArgs>> flavors;

    public Input<Map<String,FlavorDataArgs>> getFlavors() {
        return this.flavors == null ? Input.empty() : this.flavors;
    }

    /**
     * If the name version are system generated (anonymous registration).
     * 
     */
    @InputImport(name="isAnonymous")
      private final @Nullable Input<Boolean> isAnonymous;

    public Input<Boolean> getIsAnonymous() {
        return this.isAnonymous == null ? Input.empty() : this.isAnonymous;
    }

    /**
     * The path of the file/directory in the datastore.
     * 
     */
    @InputImport(name="path", required=true)
      private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    /**
     * The asset property dictionary.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ModelVersionArgs(
        @Nullable Input<String> datastoreId,
        @Nullable Input<String> description,
        @Nullable Input<Map<String,FlavorDataArgs>> flavors,
        @Nullable Input<Boolean> isAnonymous,
        Input<String> path,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<Map<String,String>> tags) {
        this.datastoreId = datastoreId;
        this.description = description;
        this.flavors = flavors;
        this.isAnonymous = isAnonymous;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.properties = properties;
        this.tags = tags;
    }

    private ModelVersionArgs() {
        this.datastoreId = Input.empty();
        this.description = Input.empty();
        this.flavors = Input.empty();
        this.isAnonymous = Input.empty();
        this.path = Input.empty();
        this.properties = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> datastoreId;
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,FlavorDataArgs>> flavors;
        private @Nullable Input<Boolean> isAnonymous;
        private Input<String> path;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.description = defaults.description;
    	      this.flavors = defaults.flavors;
    	      this.isAnonymous = defaults.isAnonymous;
    	      this.path = defaults.path;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder datastoreId(@Nullable Input<String> datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }

        public Builder datastoreId(@Nullable String datastoreId) {
            this.datastoreId = Input.ofNullable(datastoreId);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder flavors(@Nullable Input<Map<String,FlavorDataArgs>> flavors) {
            this.flavors = flavors;
            return this;
        }

        public Builder flavors(@Nullable Map<String,FlavorDataArgs> flavors) {
            this.flavors = Input.ofNullable(flavors);
            return this;
        }

        public Builder isAnonymous(@Nullable Input<Boolean> isAnonymous) {
            this.isAnonymous = isAnonymous;
            return this;
        }

        public Builder isAnonymous(@Nullable Boolean isAnonymous) {
            this.isAnonymous = Input.ofNullable(isAnonymous);
            return this;
        }

        public Builder path(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder path(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder properties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ModelVersionArgs build() {
            return new ModelVersionArgs(datastoreId, description, flavors, isAnonymous, path, properties, tags);
        }
    }
}
