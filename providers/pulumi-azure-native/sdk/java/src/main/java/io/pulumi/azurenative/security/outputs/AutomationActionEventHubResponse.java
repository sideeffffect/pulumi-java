// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutomationActionEventHubResponse {
    /**
     * The type of the action that will be triggered by the Automation
     * Expected value is 'EventHub'.
     * 
     */
    private final String actionType;
    /**
     * The target Event Hub connection string (it will not be included in any response).
     * 
     */
    private final @Nullable String connectionString;
    /**
     * The target Event Hub Azure Resource ID.
     * 
     */
    private final @Nullable String eventHubResourceId;
    /**
     * The target Event Hub SAS policy name.
     * 
     */
    private final String sasPolicyName;

    @OutputCustomType.Constructor({"actionType","connectionString","eventHubResourceId","sasPolicyName"})
    private AutomationActionEventHubResponse(
        String actionType,
        @Nullable String connectionString,
        @Nullable String eventHubResourceId,
        String sasPolicyName) {
        this.actionType = actionType;
        this.connectionString = connectionString;
        this.eventHubResourceId = eventHubResourceId;
        this.sasPolicyName = sasPolicyName;
    }

    /**
     * The type of the action that will be triggered by the Automation
     * Expected value is 'EventHub'.
     * 
    */
    public String getActionType() {
        return this.actionType;
    }
    /**
     * The target Event Hub connection string (it will not be included in any response).
     * 
    */
    public Optional<String> getConnectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    /**
     * The target Event Hub Azure Resource ID.
     * 
    */
    public Optional<String> getEventHubResourceId() {
        return Optional.ofNullable(this.eventHubResourceId);
    }
    /**
     * The target Event Hub SAS policy name.
     * 
    */
    public String getSasPolicyName() {
        return this.sasPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationActionEventHubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionType;
        private @Nullable String connectionString;
        private @Nullable String eventHubResourceId;
        private String sasPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationActionEventHubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.connectionString = defaults.connectionString;
    	      this.eventHubResourceId = defaults.eventHubResourceId;
    	      this.sasPolicyName = defaults.sasPolicyName;
        }

        public Builder setActionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }

        public Builder setConnectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setEventHubResourceId(@Nullable String eventHubResourceId) {
            this.eventHubResourceId = eventHubResourceId;
            return this;
        }

        public Builder setSasPolicyName(String sasPolicyName) {
            this.sasPolicyName = Objects.requireNonNull(sasPolicyName);
            return this;
        }
        public AutomationActionEventHubResponse build() {
            return new AutomationActionEventHubResponse(actionType, connectionString, eventHubResourceId, sasPolicyName);
        }
    }
}
