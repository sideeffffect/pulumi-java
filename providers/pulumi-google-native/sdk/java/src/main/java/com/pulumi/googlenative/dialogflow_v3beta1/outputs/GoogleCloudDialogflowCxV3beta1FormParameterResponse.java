// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1FormParameterResponse {
    /**
     * The default value of an optional parameter. If the parameter is required, the default value will be ignored.
     * 
     */
    private final Object defaultValue;
    /**
     * The human-readable name of the parameter, unique within the form.
     * 
     */
    private final String displayName;
    /**
     * The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
     * 
     */
    private final String entityType;
    /**
     * Defines fill behavior for the parameter.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse fillBehavior;
    /**
     * Indicates whether the parameter represents a list of values.
     * 
     */
    private final Boolean isList;
    /**
     * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    private final Boolean redact;
    /**
     * Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them. Required parameters must be filled before form filling concludes.
     * 
     */
    private final Boolean required;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1FormParameterResponse(
        @CustomType.Parameter("defaultValue") Object defaultValue,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("entityType") String entityType,
        @CustomType.Parameter("fillBehavior") GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse fillBehavior,
        @CustomType.Parameter("isList") Boolean isList,
        @CustomType.Parameter("redact") Boolean redact,
        @CustomType.Parameter("required") Boolean required) {
        this.defaultValue = defaultValue;
        this.displayName = displayName;
        this.entityType = entityType;
        this.fillBehavior = fillBehavior;
        this.isList = isList;
        this.redact = redact;
        this.required = required;
    }

    /**
     * The default value of an optional parameter. If the parameter is required, the default value will be ignored.
     * 
    */
    public Object defaultValue() {
        return this.defaultValue;
    }
    /**
     * The human-readable name of the parameter, unique within the form.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
     * 
    */
    public String entityType() {
        return this.entityType;
    }
    /**
     * Defines fill behavior for the parameter.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse fillBehavior() {
        return this.fillBehavior;
    }
    /**
     * Indicates whether the parameter represents a list of values.
     * 
    */
    public Boolean isList() {
        return this.isList;
    }
    /**
     * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
    */
    public Boolean redact() {
        return this.redact;
    }
    /**
     * Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them. Required parameters must be filled before form filling concludes.
     * 
    */
    public Boolean required() {
        return this.required;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FormParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object defaultValue;
        private String displayName;
        private String entityType;
        private GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse fillBehavior;
        private Boolean isList;
        private Boolean redact;
        private Boolean required;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FormParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.fillBehavior = defaults.fillBehavior;
    	      this.isList = defaults.isList;
    	      this.redact = defaults.redact;
    	      this.required = defaults.required;
        }

        public Builder defaultValue(Object defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder entityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        public Builder fillBehavior(GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorResponse fillBehavior) {
            this.fillBehavior = Objects.requireNonNull(fillBehavior);
            return this;
        }
        public Builder isList(Boolean isList) {
            this.isList = Objects.requireNonNull(isList);
            return this;
        }
        public Builder redact(Boolean redact) {
            this.redact = Objects.requireNonNull(redact);
            return this;
        }
        public Builder required(Boolean required) {
            this.required = Objects.requireNonNull(required);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1FormParameterResponse build() {
            return new GoogleCloudDialogflowCxV3beta1FormParameterResponse(defaultValue, displayName, entityType, fillBehavior, isList, redact, required);
        }
    }
}
