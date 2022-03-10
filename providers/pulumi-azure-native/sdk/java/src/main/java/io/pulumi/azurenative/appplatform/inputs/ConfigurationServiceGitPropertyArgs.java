// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.ConfigurationServiceGitRepositoryArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Property of git environment.
 * 
 */
public final class ConfigurationServiceGitPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationServiceGitPropertyArgs Empty = new ConfigurationServiceGitPropertyArgs();

    /**
     * Repositories of Application Configuration Service git property.
     * 
     */
    @InputImport(name="repositories")
      private final @Nullable Input<List<ConfigurationServiceGitRepositoryArgs>> repositories;

    public Input<List<ConfigurationServiceGitRepositoryArgs>> getRepositories() {
        return this.repositories == null ? Input.empty() : this.repositories;
    }

    public ConfigurationServiceGitPropertyArgs(@Nullable Input<List<ConfigurationServiceGitRepositoryArgs>> repositories) {
        this.repositories = repositories;
    }

    private ConfigurationServiceGitPropertyArgs() {
        this.repositories = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationServiceGitPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ConfigurationServiceGitRepositoryArgs>> repositories;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationServiceGitPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositories = defaults.repositories;
        }

        public Builder repositories(@Nullable Input<List<ConfigurationServiceGitRepositoryArgs>> repositories) {
            this.repositories = repositories;
            return this;
        }

        public Builder repositories(@Nullable List<ConfigurationServiceGitRepositoryArgs> repositories) {
            this.repositories = Input.ofNullable(repositories);
            return this;
        }
        public ConfigurationServiceGitPropertyArgs build() {
            return new ConfigurationServiceGitPropertyArgs(repositories);
        }
    }
}
