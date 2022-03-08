// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3EntityTypeEntityResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetSessionEntityTypeResult {
    /**
     * The collection of entities to override or supplement the custom entity type.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3EntityTypeEntityResponse> entities;
    /**
     * Indicates whether the additional data should override or supplement the custom entity type definition.
     * 
     */
    private final String entityOverrideMode;
    /**
     * The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"entities","entityOverrideMode","name"})
    private GetSessionEntityTypeResult(
        List<GoogleCloudDialogflowCxV3EntityTypeEntityResponse> entities,
        String entityOverrideMode,
        String name) {
        this.entities = entities;
        this.entityOverrideMode = entityOverrideMode;
        this.name = name;
    }

    /**
     * The collection of entities to override or supplement the custom entity type.
     * 
    */
    public List<GoogleCloudDialogflowCxV3EntityTypeEntityResponse> getEntities() {
        return this.entities;
    }
    /**
     * Indicates whether the additional data should override or supplement the custom entity type definition.
     * 
    */
    public String getEntityOverrideMode() {
        return this.entityOverrideMode;
    }
    /**
     * The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSessionEntityTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3EntityTypeEntityResponse> entities;
        private String entityOverrideMode;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSessionEntityTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entities = defaults.entities;
    	      this.entityOverrideMode = defaults.entityOverrideMode;
    	      this.name = defaults.name;
        }

        public Builder setEntities(List<GoogleCloudDialogflowCxV3EntityTypeEntityResponse> entities) {
            this.entities = Objects.requireNonNull(entities);
            return this;
        }

        public Builder setEntityOverrideMode(String entityOverrideMode) {
            this.entityOverrideMode = Objects.requireNonNull(entityOverrideMode);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetSessionEntityTypeResult build() {
            return new GetSessionEntityTypeResult(entities, entityOverrideMode, name);
        }
    }
}
