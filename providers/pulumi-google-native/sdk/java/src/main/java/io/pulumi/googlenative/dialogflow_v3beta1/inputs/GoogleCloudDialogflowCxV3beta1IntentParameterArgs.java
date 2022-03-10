// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents an intent parameter.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1IntentParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1IntentParameterArgs Empty = new GoogleCloudDialogflowCxV3beta1IntentParameterArgs();

    /**
     * The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
     * 
     */
    @InputImport(name="entityType", required=true)
      private final Input<String> entityType;

    public Input<String> getEntityType() {
        return this.entityType;
    }

    /**
     * The unique identifier of the parameter. This field is used by training phrases to annotate their parts.
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * Indicates whether the parameter represents a list of values.
     * 
     */
    @InputImport(name="isList")
      private final @Nullable Input<Boolean> isList;

    public Input<Boolean> getIsList() {
        return this.isList == null ? Input.empty() : this.isList;
    }

    /**
     * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    @InputImport(name="redact")
      private final @Nullable Input<Boolean> redact;

    public Input<Boolean> getRedact() {
        return this.redact == null ? Input.empty() : this.redact;
    }

    public GoogleCloudDialogflowCxV3beta1IntentParameterArgs(
        Input<String> entityType,
        Input<String> id,
        @Nullable Input<Boolean> isList,
        @Nullable Input<Boolean> redact) {
        this.entityType = Objects.requireNonNull(entityType, "expected parameter 'entityType' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.isList = isList;
        this.redact = redact;
    }

    private GoogleCloudDialogflowCxV3beta1IntentParameterArgs() {
        this.entityType = Input.empty();
        this.id = Input.empty();
        this.isList = Input.empty();
        this.redact = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1IntentParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> entityType;
        private Input<String> id;
        private @Nullable Input<Boolean> isList;
        private @Nullable Input<Boolean> redact;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1IntentParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityType = defaults.entityType;
    	      this.id = defaults.id;
    	      this.isList = defaults.isList;
    	      this.redact = defaults.redact;
        }

        public Builder entityType(Input<String> entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }

        public Builder entityType(String entityType) {
            this.entityType = Input.of(Objects.requireNonNull(entityType));
            return this;
        }

        public Builder id(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder isList(@Nullable Input<Boolean> isList) {
            this.isList = isList;
            return this;
        }

        public Builder isList(@Nullable Boolean isList) {
            this.isList = Input.ofNullable(isList);
            return this;
        }

        public Builder redact(@Nullable Input<Boolean> redact) {
            this.redact = redact;
            return this;
        }

        public Builder redact(@Nullable Boolean redact) {
            this.redact = Input.ofNullable(redact);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1IntentParameterArgs build() {
            return new GoogleCloudDialogflowCxV3beta1IntentParameterArgs(entityType, id, isList, redact);
        }
    }
}
