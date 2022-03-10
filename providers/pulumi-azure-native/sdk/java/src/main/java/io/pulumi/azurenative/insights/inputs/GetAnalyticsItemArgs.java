// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAnalyticsItemArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAnalyticsItemArgs Empty = new GetAnalyticsItemArgs();

    /**
     * The Id of a specific item defined in the Application Insights component
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of a specific item defined in the Application Insights component
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Application Insights component resource.
     * 
     */
    @InputImport(name="resourceName", required=true)
      private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    /**
     * Enum indicating if this item definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
     */
    @InputImport(name="scopePath", required=true)
      private final String scopePath;

    public String getScopePath() {
        return this.scopePath;
    }

    public GetAnalyticsItemArgs(
        @Nullable String id,
        @Nullable String name,
        String resourceGroupName,
        String resourceName,
        String scopePath) {
        this.id = id;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.scopePath = Objects.requireNonNull(scopePath, "expected parameter 'scopePath' to be non-null");
    }

    private GetAnalyticsItemArgs() {
        this.id = null;
        this.name = null;
        this.resourceGroupName = null;
        this.resourceName = null;
        this.scopePath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnalyticsItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;
        private String resourceGroupName;
        private String resourceName;
        private String scopePath;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnalyticsItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.scopePath = defaults.scopePath;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder scopePath(String scopePath) {
            this.scopePath = Objects.requireNonNull(scopePath);
            return this;
        }
        public GetAnalyticsItemArgs build() {
            return new GetAnalyticsItemArgs(id, name, resourceGroupName, resourceName, scopePath);
        }
    }
}
