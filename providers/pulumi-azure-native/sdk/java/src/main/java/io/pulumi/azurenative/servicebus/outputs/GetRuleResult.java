// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.azurenative.servicebus.outputs.ActionResponse;
import io.pulumi.azurenative.servicebus.outputs.CorrelationFilterResponse;
import io.pulumi.azurenative.servicebus.outputs.SqlFilterResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRuleResult {
    /**
     * Represents the filter actions which are allowed for the transformation of a message that have been matched by a filter expression.
     * 
     */
    private final @Nullable ActionResponse action;
    /**
     * Properties of correlationFilter
     * 
     */
    private final @Nullable CorrelationFilterResponse correlationFilter;
    /**
     * Filter type that is evaluated against a BrokeredMessage.
     * 
     */
    private final @Nullable String filterType;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Properties of sqlFilter
     * 
     */
    private final @Nullable SqlFilterResponse sqlFilter;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"action","correlationFilter","filterType","id","name","sqlFilter","type"})
    private GetRuleResult(
        @Nullable ActionResponse action,
        @Nullable CorrelationFilterResponse correlationFilter,
        @Nullable String filterType,
        String id,
        String name,
        @Nullable SqlFilterResponse sqlFilter,
        String type) {
        this.action = action;
        this.correlationFilter = correlationFilter;
        this.filterType = filterType;
        this.id = id;
        this.name = name;
        this.sqlFilter = sqlFilter;
        this.type = type;
    }

    /**
     * Represents the filter actions which are allowed for the transformation of a message that have been matched by a filter expression.
     * 
    */
    public Optional<ActionResponse> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * Properties of correlationFilter
     * 
    */
    public Optional<CorrelationFilterResponse> getCorrelationFilter() {
        return Optional.ofNullable(this.correlationFilter);
    }
    /**
     * Filter type that is evaluated against a BrokeredMessage.
     * 
    */
    public Optional<String> getFilterType() {
        return Optional.ofNullable(this.filterType);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Properties of sqlFilter
     * 
    */
    public Optional<SqlFilterResponse> getSqlFilter() {
        return Optional.ofNullable(this.sqlFilter);
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ActionResponse action;
        private @Nullable CorrelationFilterResponse correlationFilter;
        private @Nullable String filterType;
        private String id;
        private String name;
        private @Nullable SqlFilterResponse sqlFilter;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.correlationFilter = defaults.correlationFilter;
    	      this.filterType = defaults.filterType;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.sqlFilter = defaults.sqlFilter;
    	      this.type = defaults.type;
        }

        public Builder setAction(@Nullable ActionResponse action) {
            this.action = action;
            return this;
        }

        public Builder setCorrelationFilter(@Nullable CorrelationFilterResponse correlationFilter) {
            this.correlationFilter = correlationFilter;
            return this;
        }

        public Builder setFilterType(@Nullable String filterType) {
            this.filterType = filterType;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSqlFilter(@Nullable SqlFilterResponse sqlFilter) {
            this.sqlFilter = sqlFilter;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRuleResult build() {
            return new GetRuleResult(action, correlationFilter, filterType, id, name, sqlFilter, type);
        }
    }
}
