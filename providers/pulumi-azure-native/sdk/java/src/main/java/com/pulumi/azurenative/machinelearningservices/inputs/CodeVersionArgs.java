// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Code asset version details.
 * 
 */
public final class CodeVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CodeVersionArgs Empty = new CodeVersionArgs();

    /**
     * ARM resource ID of the datastore where the asset is located.
     * 
     */
    @Import(name="datastoreId")
      private final @Nullable Output<String> datastoreId;

    public Output<String> datastoreId() {
        return this.datastoreId == null ? Codegen.empty() : this.datastoreId;
    }

    /**
     * The asset description text.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * If the name version are system generated (anonymous registration).
     * 
     */
    @Import(name="isAnonymous")
      private final @Nullable Output<Boolean> isAnonymous;

    public Output<Boolean> isAnonymous() {
        return this.isAnonymous == null ? Codegen.empty() : this.isAnonymous;
    }

    /**
     * The path of the file/directory in the datastore.
     * 
     */
    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    /**
     * The asset property dictionary.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public CodeVersionArgs(
        @Nullable Output<String> datastoreId,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> isAnonymous,
        Output<String> path,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<Map<String,String>> tags) {
        this.datastoreId = datastoreId;
        this.description = description;
        this.isAnonymous = isAnonymous;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.properties = properties;
        this.tags = tags;
    }

    private CodeVersionArgs() {
        this.datastoreId = Codegen.empty();
        this.description = Codegen.empty();
        this.isAnonymous = Codegen.empty();
        this.path = Codegen.empty();
        this.properties = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> datastoreId;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> isAnonymous;
        private Output<String> path;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.description = defaults.description;
    	      this.isAnonymous = defaults.isAnonymous;
    	      this.path = defaults.path;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder datastoreId(@Nullable Output<String> datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }
        public Builder datastoreId(@Nullable String datastoreId) {
            this.datastoreId = Codegen.ofNullable(datastoreId);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder isAnonymous(@Nullable Output<Boolean> isAnonymous) {
            this.isAnonymous = isAnonymous;
            return this;
        }
        public Builder isAnonymous(@Nullable Boolean isAnonymous) {
            this.isAnonymous = Codegen.ofNullable(isAnonymous);
            return this;
        }
        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public CodeVersionArgs build() {
            return new CodeVersionArgs(datastoreId, description, isAnonymous, path, properties, tags);
        }
    }
}
