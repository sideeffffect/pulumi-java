// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights;

import com.pulumi.azurenative.operationalinsights.inputs.TagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SavedSearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final SavedSearchArgs Empty = new SavedSearchArgs();

    /**
     * The category of the saved search. This helps the user to find a saved search faster.
     * 
     */
    @Import(name="category", required=true)
    private Output<String> category;

    public Output<String> category() {
        return this.category;
    }

    /**
     * Saved search display name.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The function alias if query serves as a function.
     * 
     */
    @Import(name="functionAlias")
    private @Nullable Output<String> functionAlias;

    public Optional<Output<String>> functionAlias() {
        return Optional.ofNullable(this.functionAlias);
    }

    /**
     * The optional function parameters if query serves as a function. Value should be in the following format: &#39;param-name1:type1 = default_value1, param-name2:type2 = default_value2&#39;. For more examples and proper syntax please refer to https://docs.microsoft.com/en-us/azure/kusto/query/functions/user-defined-functions.
     * 
     */
    @Import(name="functionParameters")
    private @Nullable Output<String> functionParameters;

    public Optional<Output<String>> functionParameters() {
        return Optional.ofNullable(this.functionParameters);
    }

    /**
     * The query expression for the saved search.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    public Output<String> query() {
        return this.query;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The id of the saved search.
     * 
     */
    @Import(name="savedSearchId")
    private @Nullable Output<String> savedSearchId;

    public Optional<Output<String>> savedSearchId() {
        return Optional.ofNullable(this.savedSearchId);
    }

    /**
     * The tags attached to the saved search.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<TagArgs>> tags;

    public Optional<Output<List<TagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The version number of the query language. The current version is 2 and is the default.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Double> version;

    public Optional<Output<Double>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private SavedSearchArgs() {}

    private SavedSearchArgs(SavedSearchArgs $) {
        this.category = $.category;
        this.displayName = $.displayName;
        this.functionAlias = $.functionAlias;
        this.functionParameters = $.functionParameters;
        this.query = $.query;
        this.resourceGroupName = $.resourceGroupName;
        this.savedSearchId = $.savedSearchId;
        this.tags = $.tags;
        this.version = $.version;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SavedSearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SavedSearchArgs $;

        public Builder() {
            $ = new SavedSearchArgs();
        }

        public Builder(SavedSearchArgs defaults) {
            $ = new SavedSearchArgs(Objects.requireNonNull(defaults));
        }

        public Builder category(Output<String> category) {
            $.category = category;
            return this;
        }

        public Builder category(String category) {
            return category(Output.of(category));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder functionAlias(@Nullable Output<String> functionAlias) {
            $.functionAlias = functionAlias;
            return this;
        }

        public Builder functionAlias(String functionAlias) {
            return functionAlias(Output.of(functionAlias));
        }

        public Builder functionParameters(@Nullable Output<String> functionParameters) {
            $.functionParameters = functionParameters;
            return this;
        }

        public Builder functionParameters(String functionParameters) {
            return functionParameters(Output.of(functionParameters));
        }

        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        public Builder query(String query) {
            return query(Output.of(query));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder savedSearchId(@Nullable Output<String> savedSearchId) {
            $.savedSearchId = savedSearchId;
            return this;
        }

        public Builder savedSearchId(String savedSearchId) {
            return savedSearchId(Output.of(savedSearchId));
        }

        public Builder tags(@Nullable Output<List<TagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<TagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(TagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder version(@Nullable Output<Double> version) {
            $.version = version;
            return this;
        }

        public Builder version(Double version) {
            return version(Output.of(version));
        }

        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public SavedSearchArgs build() {
            $.category = Objects.requireNonNull($.category, "expected parameter 'category' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.query = Objects.requireNonNull($.query, "expected parameter 'query' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
