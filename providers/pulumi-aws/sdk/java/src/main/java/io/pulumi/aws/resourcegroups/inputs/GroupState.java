// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.resourcegroups.inputs;

import io.pulumi.aws.resourcegroups.inputs.GroupResourceQueryGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupState extends io.pulumi.resources.ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * The ARN assigned by AWS for this resource group.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * A description of the resource group.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The resource group's name. A resource group name can have a maximum of 127 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with `AWS` or `aws`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A `resource_query` block. Resource queries are documented below.
     * 
     */
    @InputImport(name="resourceQuery")
      private final @Nullable Input<GroupResourceQueryGetArgs> resourceQuery;

    public Input<GroupResourceQueryGetArgs> getResourceQuery() {
        return this.resourceQuery == null ? Input.empty() : this.resourceQuery;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public GroupState(
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<GroupResourceQueryGetArgs> resourceQuery,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.name = name;
        this.resourceQuery = resourceQuery;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private GroupState() {
        this.arn = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.resourceQuery = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<GroupResourceQueryGetArgs> resourceQuery;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.resourceQuery = defaults.resourceQuery;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
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

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder resourceQuery(@Nullable Input<GroupResourceQueryGetArgs> resourceQuery) {
            this.resourceQuery = resourceQuery;
            return this;
        }

        public Builder resourceQuery(@Nullable GroupResourceQueryGetArgs resourceQuery) {
            this.resourceQuery = Input.ofNullable(resourceQuery);
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

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public GroupState build() {
            return new GroupState(arn, description, name, resourceQuery, tags, tagsAll);
        }
    }
}
