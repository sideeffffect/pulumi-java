// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v2beta1.outputs.GoogleCloudDialogflowV2beta1EntityTypeEntityResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSessionEntityTypeResult {
    /**
     * @return The collection of entities associated with this session entity type.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> entities;
    /**
     * @return Indicates whether the additional data should override or supplement the custom entity type definition.
     * 
     */
    private final String entityOverrideMode;
    /**
     * @return The unique identifier of this session entity type. Supported formats: - `projects//agent/sessions//entityTypes/` - `projects//locations//agent/sessions//entityTypes/` - `projects//agent/environments//users//sessions//entityTypes/` - `projects//locations//agent/environments/ /users//sessions//entityTypes/` If `Location ID` is not specified we assume default &#39;us&#39; location. If `Environment ID` is not specified, we assume default &#39;draft&#39; environment. If `User ID` is not specified, we assume default &#39;-&#39; user. `` must be the display name of an existing entity type in the same agent that will be overridden or supplemented.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetSessionEntityTypeResult(
        @CustomType.Parameter("entities") List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> entities,
        @CustomType.Parameter("entityOverrideMode") String entityOverrideMode,
        @CustomType.Parameter("name") String name) {
        this.entities = entities;
        this.entityOverrideMode = entityOverrideMode;
        this.name = name;
    }

    /**
     * @return The collection of entities associated with this session entity type.
     * 
     */
    public List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> entities() {
        return this.entities;
    }
    /**
     * @return Indicates whether the additional data should override or supplement the custom entity type definition.
     * 
     */
    public String entityOverrideMode() {
        return this.entityOverrideMode;
    }
    /**
     * @return The unique identifier of this session entity type. Supported formats: - `projects//agent/sessions//entityTypes/` - `projects//locations//agent/sessions//entityTypes/` - `projects//agent/environments//users//sessions//entityTypes/` - `projects//locations//agent/environments/ /users//sessions//entityTypes/` If `Location ID` is not specified we assume default &#39;us&#39; location. If `Environment ID` is not specified, we assume default &#39;draft&#39; environment. If `User ID` is not specified, we assume default &#39;-&#39; user. `` must be the display name of an existing entity type in the same agent that will be overridden or supplemented.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSessionEntityTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> entities;
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

        public Builder entities(List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse> entities) {
            this.entities = Objects.requireNonNull(entities);
            return this;
        }
        public Builder entities(GoogleCloudDialogflowV2beta1EntityTypeEntityResponse... entities) {
            return entities(List.of(entities));
        }
        public Builder entityOverrideMode(String entityOverrideMode) {
            this.entityOverrideMode = Objects.requireNonNull(entityOverrideMode);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetSessionEntityTypeResult build() {
            return new GetSessionEntityTypeResult(entities, entityOverrideMode, name);
        }
    }
}
