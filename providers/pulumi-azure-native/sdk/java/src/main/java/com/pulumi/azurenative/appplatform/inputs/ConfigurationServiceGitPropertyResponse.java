// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.azurenative.appplatform.inputs.ConfigurationServiceGitRepositoryResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Property of git environment.
 * 
 */
public final class ConfigurationServiceGitPropertyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConfigurationServiceGitPropertyResponse Empty = new ConfigurationServiceGitPropertyResponse();

    /**
     * Repositories of Application Configuration Service git property.
     * 
     */
    @Import(name="repositories")
      private final @Nullable List<ConfigurationServiceGitRepositoryResponse> repositories;

    public List<ConfigurationServiceGitRepositoryResponse> repositories() {
        return this.repositories == null ? List.of() : this.repositories;
    }

    public ConfigurationServiceGitPropertyResponse(@Nullable List<ConfigurationServiceGitRepositoryResponse> repositories) {
        this.repositories = repositories;
    }

    private ConfigurationServiceGitPropertyResponse() {
        this.repositories = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationServiceGitPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ConfigurationServiceGitRepositoryResponse> repositories;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationServiceGitPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositories = defaults.repositories;
        }

        public Builder repositories(@Nullable List<ConfigurationServiceGitRepositoryResponse> repositories) {
            this.repositories = repositories;
            return this;
        }
        public Builder repositories(ConfigurationServiceGitRepositoryResponse... repositories) {
            return repositories(List.of(repositories));
        }        public ConfigurationServiceGitPropertyResponse build() {
            return new ConfigurationServiceGitPropertyResponse(repositories);
        }
    }
}
