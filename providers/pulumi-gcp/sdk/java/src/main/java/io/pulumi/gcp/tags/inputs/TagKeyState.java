// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagKeyState extends io.pulumi.resources.ResourceArgs {

    public static final TagKeyState Empty = new TagKeyState();

    /**
     * Output only. Creation time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * User-assigned description of the TagKey. Must not exceed 256 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The generated numeric id for the TagKey.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Output only. Namespaced name of the TagKey.
     * 
     */
    @Import(name="namespacedName")
      private final @Nullable Output<String> namespacedName;

    public Output<String> namespacedName() {
        return this.namespacedName == null ? Codegen.empty() : this.namespacedName;
    }

    /**
     * Input only. The resource name of the new TagKey's parent. Must be of the form organizations/{org_id}.
     * 
     */
    @Import(name="parent")
      private final @Nullable Output<String> parent;

    public Output<String> parent() {
        return this.parent == null ? Codegen.empty() : this.parent;
    }

    /**
     * Input only. The user friendly name for a TagKey. The short name should be unique for TagKeys within the same tag namespace.
     * The short name must be 1-63 characters, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @Import(name="shortName")
      private final @Nullable Output<String> shortName;

    public Output<String> shortName() {
        return this.shortName == null ? Codegen.empty() : this.shortName;
    }

    /**
     * Output only. Update time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional
     * digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> updateTime() {
        return this.updateTime == null ? Codegen.empty() : this.updateTime;
    }

    public TagKeyState(
        @Nullable Output<String> createTime,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> namespacedName,
        @Nullable Output<String> parent,
        @Nullable Output<String> shortName,
        @Nullable Output<String> updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.name = name;
        this.namespacedName = namespacedName;
        this.parent = parent;
        this.shortName = shortName;
        this.updateTime = updateTime;
    }

    private TagKeyState() {
        this.createTime = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.namespacedName = Codegen.empty();
        this.parent = Codegen.empty();
        this.shortName = Codegen.empty();
        this.updateTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namespacedName;
        private @Nullable Output<String> parent;
        private @Nullable Output<String> shortName;
        private @Nullable Output<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TagKeyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.namespacedName = defaults.namespacedName;
    	      this.parent = defaults.parent;
    	      this.shortName = defaults.shortName;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namespacedName(@Nullable Output<String> namespacedName) {
            this.namespacedName = namespacedName;
            return this;
        }
        public Builder namespacedName(@Nullable String namespacedName) {
            this.namespacedName = Codegen.ofNullable(namespacedName);
            return this;
        }
        public Builder parent(@Nullable Output<String> parent) {
            this.parent = parent;
            return this;
        }
        public Builder parent(@Nullable String parent) {
            this.parent = Codegen.ofNullable(parent);
            return this;
        }
        public Builder shortName(@Nullable Output<String> shortName) {
            this.shortName = shortName;
            return this;
        }
        public Builder shortName(@Nullable String shortName) {
            this.shortName = Codegen.ofNullable(shortName);
            return this;
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Codegen.ofNullable(updateTime);
            return this;
        }        public TagKeyState build() {
            return new TagKeyState(createTime, description, name, namespacedName, parent, shortName, updateTime);
        }
    }
}
