// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.inputs;

import io.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateSettingGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationTemplateState extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationTemplateState Empty = new ConfigurationTemplateState();

    /**
     * name of the application to associate with this configuration template
     * 
     */
    @InputImport(name="application")
      private final @Nullable Input<String> application;

    public Input<String> getApplication() {
        return this.application == null ? Input.empty() : this.application;
    }

    /**
     * Short description of the Template
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The ID of the environment used with this configuration template
     * 
     */
    @InputImport(name="environmentId")
      private final @Nullable Input<String> environmentId;

    public Input<String> getEnvironmentId() {
        return this.environmentId == null ? Input.empty() : this.environmentId;
    }

    /**
     * A unique name for this Template.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Option settings to configure the new Environment. These
     * override specific values that are set as defaults. The format is detailed
     * below in Option Settings
     * 
     */
    @InputImport(name="settings")
      private final @Nullable Input<List<ConfigurationTemplateSettingGetArgs>> settings;

    public Input<List<ConfigurationTemplateSettingGetArgs>> getSettings() {
        return this.settings == null ? Input.empty() : this.settings;
    }

    /**
     * A solution stack to base your Template
     * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
     * 
     */
    @InputImport(name="solutionStackName")
      private final @Nullable Input<String> solutionStackName;

    public Input<String> getSolutionStackName() {
        return this.solutionStackName == null ? Input.empty() : this.solutionStackName;
    }

    public ConfigurationTemplateState(
        @Nullable Input<String> application,
        @Nullable Input<String> description,
        @Nullable Input<String> environmentId,
        @Nullable Input<String> name,
        @Nullable Input<List<ConfigurationTemplateSettingGetArgs>> settings,
        @Nullable Input<String> solutionStackName) {
        this.application = application;
        this.description = description;
        this.environmentId = environmentId;
        this.name = name;
        this.settings = settings;
        this.solutionStackName = solutionStackName;
    }

    private ConfigurationTemplateState() {
        this.application = Input.empty();
        this.description = Input.empty();
        this.environmentId = Input.empty();
        this.name = Input.empty();
        this.settings = Input.empty();
        this.solutionStackName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> application;
        private @Nullable Input<String> description;
        private @Nullable Input<String> environmentId;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ConfigurationTemplateSettingGetArgs>> settings;
        private @Nullable Input<String> solutionStackName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationTemplateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.application = defaults.application;
    	      this.description = defaults.description;
    	      this.environmentId = defaults.environmentId;
    	      this.name = defaults.name;
    	      this.settings = defaults.settings;
    	      this.solutionStackName = defaults.solutionStackName;
        }

        public Builder application(@Nullable Input<String> application) {
            this.application = application;
            return this;
        }

        public Builder application(@Nullable String application) {
            this.application = Input.ofNullable(application);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder environmentId(@Nullable Input<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = Input.ofNullable(environmentId);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder settings(@Nullable Input<List<ConfigurationTemplateSettingGetArgs>> settings) {
            this.settings = settings;
            return this;
        }

        public Builder settings(@Nullable List<ConfigurationTemplateSettingGetArgs> settings) {
            this.settings = Input.ofNullable(settings);
            return this;
        }

        public Builder solutionStackName(@Nullable Input<String> solutionStackName) {
            this.solutionStackName = solutionStackName;
            return this;
        }

        public Builder solutionStackName(@Nullable String solutionStackName) {
            this.solutionStackName = Input.ofNullable(solutionStackName);
            return this;
        }
        public ConfigurationTemplateState build() {
            return new ConfigurationTemplateState(application, description, environmentId, name, settings, solutionStackName);
        }
    }
}
