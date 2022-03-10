// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ExpressionResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FilterActivityResponse {
    /**
     * Condition to be used for filtering the input.
     * 
     */
    private final ExpressionResponse condition;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Input array on which filter should be applied.
     * 
     */
    private final ExpressionResponse items;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Type of activity.
     * Expected value is 'Filter'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor
    private FilterActivityResponse(
        @OutputCustomType.Parameter("condition") ExpressionResponse condition,
        @OutputCustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("items") ExpressionResponse items,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties) {
        this.condition = condition;
        this.dependsOn = dependsOn;
        this.description = description;
        this.items = items;
        this.name = name;
        this.type = type;
        this.userProperties = userProperties;
    }

    /**
     * Condition to be used for filtering the input.
     * 
    */
    public ExpressionResponse getCondition() {
        return this.condition;
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Input array on which filter should be applied.
     * 
    */
    public ExpressionResponse getItems() {
        return this.items;
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Type of activity.
     * Expected value is 'Filter'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressionResponse condition;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private ExpressionResponse items;
        private String name;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder condition(ExpressionResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder items(ExpressionResponse items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public FilterActivityResponse build() {
            return new FilterActivityResponse(condition, dependsOn, description, items, name, type, userProperties);
        }
    }
}
