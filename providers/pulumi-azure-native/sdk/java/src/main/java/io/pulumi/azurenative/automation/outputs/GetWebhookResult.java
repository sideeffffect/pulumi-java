// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.RunbookAssociationPropertyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebhookResult {
    /**
     * Gets or sets the creation time.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * Gets or sets the description.
     * 
     */
    private final @Nullable String description;
    /**
     * Gets or sets the expiry time.
     * 
     */
    private final @Nullable String expiryTime;
    /**
     * Fully qualified resource Id for the resource
     * 
     */
    private final String id;
    /**
     * Gets or sets the value of the enabled flag of the webhook.
     * 
     */
    private final @Nullable Boolean isEnabled;
    /**
     * Gets or sets the last invoked time.
     * 
     */
    private final @Nullable String lastInvokedTime;
    /**
     * Details of the user who last modified the Webhook
     * 
     */
    private final @Nullable String lastModifiedBy;
    /**
     * Gets or sets the last modified time.
     * 
     */
    private final @Nullable String lastModifiedTime;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Gets or sets the parameters of the job that is created when the webhook calls the runbook it is associated with.
     * 
     */
    private final @Nullable Map<String,String> parameters;
    /**
     * Gets or sets the name of the hybrid worker group the webhook job will run on.
     * 
     */
    private final @Nullable String runOn;
    /**
     * Gets or sets the runbook the webhook is associated with.
     * 
     */
    private final @Nullable RunbookAssociationPropertyResponse runbook;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * Gets or sets the webhook uri.
     * 
     */
    private final @Nullable String uri;

    @OutputCustomType.Constructor
    private GetWebhookResult(
        @OutputCustomType.Parameter("creationTime") @Nullable String creationTime,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("expiryTime") @Nullable String expiryTime,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("isEnabled") @Nullable Boolean isEnabled,
        @OutputCustomType.Parameter("lastInvokedTime") @Nullable String lastInvokedTime,
        @OutputCustomType.Parameter("lastModifiedBy") @Nullable String lastModifiedBy,
        @OutputCustomType.Parameter("lastModifiedTime") @Nullable String lastModifiedTime,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,String> parameters,
        @OutputCustomType.Parameter("runOn") @Nullable String runOn,
        @OutputCustomType.Parameter("runbook") @Nullable RunbookAssociationPropertyResponse runbook,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("uri") @Nullable String uri) {
        this.creationTime = creationTime;
        this.description = description;
        this.expiryTime = expiryTime;
        this.id = id;
        this.isEnabled = isEnabled;
        this.lastInvokedTime = lastInvokedTime;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedTime = lastModifiedTime;
        this.name = name;
        this.parameters = parameters;
        this.runOn = runOn;
        this.runbook = runbook;
        this.type = type;
        this.uri = uri;
    }

    /**
     * Gets or sets the creation time.
     * 
    */
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * Gets or sets the description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Gets or sets the expiry time.
     * 
    */
    public Optional<String> getExpiryTime() {
        return Optional.ofNullable(this.expiryTime);
    }
    /**
     * Fully qualified resource Id for the resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets or sets the value of the enabled flag of the webhook.
     * 
    */
    public Optional<Boolean> getIsEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    /**
     * Gets or sets the last invoked time.
     * 
    */
    public Optional<String> getLastInvokedTime() {
        return Optional.ofNullable(this.lastInvokedTime);
    }
    /**
     * Details of the user who last modified the Webhook
     * 
    */
    public Optional<String> getLastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }
    /**
     * Gets or sets the last modified time.
     * 
    */
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the parameters of the job that is created when the webhook calls the runbook it is associated with.
     * 
    */
    public Map<String,String> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Gets or sets the name of the hybrid worker group the webhook job will run on.
     * 
    */
    public Optional<String> getRunOn() {
        return Optional.ofNullable(this.runOn);
    }
    /**
     * Gets or sets the runbook the webhook is associated with.
     * 
    */
    public Optional<RunbookAssociationPropertyResponse> getRunbook() {
        return Optional.ofNullable(this.runbook);
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Gets or sets the webhook uri.
     * 
    */
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebhookResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable String description;
        private @Nullable String expiryTime;
        private String id;
        private @Nullable Boolean isEnabled;
        private @Nullable String lastInvokedTime;
        private @Nullable String lastModifiedBy;
        private @Nullable String lastModifiedTime;
        private String name;
        private @Nullable Map<String,String> parameters;
        private @Nullable String runOn;
        private @Nullable RunbookAssociationPropertyResponse runbook;
        private String type;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebhookResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.expiryTime = defaults.expiryTime;
    	      this.id = defaults.id;
    	      this.isEnabled = defaults.isEnabled;
    	      this.lastInvokedTime = defaults.lastInvokedTime;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.runOn = defaults.runOn;
    	      this.runbook = defaults.runbook;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder expiryTime(@Nullable String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder lastInvokedTime(@Nullable String lastInvokedTime) {
            this.lastInvokedTime = lastInvokedTime;
            return this;
        }

        public Builder lastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder lastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder runOn(@Nullable String runOn) {
            this.runOn = runOn;
            return this;
        }

        public Builder runbook(@Nullable RunbookAssociationPropertyResponse runbook) {
            this.runbook = runbook;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public GetWebhookResult build() {
            return new GetWebhookResult(creationTime, description, expiryTime, id, isEnabled, lastInvokedTime, lastModifiedBy, lastModifiedTime, name, parameters, runOn, runbook, type, uri);
        }
    }
}
