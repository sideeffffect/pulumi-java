// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateState extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateState Empty = new PreventionInspectTemplateState();

    /**
     * A description of the inspect template.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * User set display name of the inspect template.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The core content of the template.
     * Structure is documented below.
     * 
     */
    @Import(name="inspectConfig")
      private final @Nullable Output<PreventionInspectTemplateInspectConfigGetArgs> inspectConfig;

    public Output<PreventionInspectTemplateInspectConfigGetArgs> inspectConfig() {
        return this.inspectConfig == null ? Codegen.empty() : this.inspectConfig;
    }

    /**
     * Resource name of the requested StoredInfoType, for example `organizations/433245324/storedInfoTypes/432452342`
     * or `projects/project-id/storedInfoTypes/432452342`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The parent of the inspect template in any of the following formats:
     * * `projects/{{project}}`
     * * `projects/{{project}}/locations/{{location}}`
     * * `organizations/{{organization_id}}`
     * * `organizations/{{organization_id}}/locations/{{location}}`
     * 
     */
    @Import(name="parent")
      private final @Nullable Output<String> parent;

    public Output<String> parent() {
        return this.parent == null ? Codegen.empty() : this.parent;
    }

    public PreventionInspectTemplateState(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<PreventionInspectTemplateInspectConfigGetArgs> inspectConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> parent) {
        this.description = description;
        this.displayName = displayName;
        this.inspectConfig = inspectConfig;
        this.name = name;
        this.parent = parent;
    }

    private PreventionInspectTemplateState() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.inspectConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.parent = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<PreventionInspectTemplateInspectConfigGetArgs> inspectConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parent;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.inspectConfig = defaults.inspectConfig;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder inspectConfig(@Nullable Output<PreventionInspectTemplateInspectConfigGetArgs> inspectConfig) {
            this.inspectConfig = inspectConfig;
            return this;
        }
        public Builder inspectConfig(@Nullable PreventionInspectTemplateInspectConfigGetArgs inspectConfig) {
            this.inspectConfig = Codegen.ofNullable(inspectConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder parent(@Nullable Output<String> parent) {
            this.parent = parent;
            return this;
        }
        public Builder parent(@Nullable String parent) {
            this.parent = Codegen.ofNullable(parent);
            return this;
        }        public PreventionInspectTemplateState build() {
            return new PreventionInspectTemplateState(description, displayName, inspectConfig, name, parent);
        }
    }
}
