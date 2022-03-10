// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEnvironmentResult {
    /**
     * Configuration parameters for the environment.
     * 
     */
    private final List<GetEnvironmentConfig> configs;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Map<String,String> labels;
    private final String name;
    private final @Nullable String project;
    private final @Nullable String region;

    @OutputCustomType.Constructor
    private GetEnvironmentResult(
        @OutputCustomType.Parameter("configs") List<GetEnvironmentConfig> configs,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("project") @Nullable String project,
        @OutputCustomType.Parameter("region") @Nullable String region) {
        this.configs = configs;
        this.id = id;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.region = region;
    }

    /**
     * Configuration parameters for the environment.
     * 
    */
    public List<GetEnvironmentConfig> getConfigs() {
        return this.configs;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetEnvironmentConfig> configs;
        private String id;
        private Map<String,String> labels;
        private String name;
        private @Nullable String project;
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configs = defaults.configs;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder configs(List<GetEnvironmentConfig> configs) {
            this.configs = Objects.requireNonNull(configs);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(configs, id, labels, name, project, region);
        }
    }
}
