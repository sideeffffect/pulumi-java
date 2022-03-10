// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudbuild_v1alpha1.enums.WorkerPoolRegionsItem;
import io.pulumi.googlenative.cloudbuild_v1alpha1.inputs.WorkerConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkerPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkerPoolArgs Empty = new WorkerPoolArgs();

    /**
     * User-defined name of the `WorkerPool`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The project ID of the GCP project for which the `WorkerPool` is created.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * List of regions to create the `WorkerPool`. Regions can't be empty. If Cloud Build adds a new GCP region in the future, the existing `WorkerPool` will not be enabled in the new region automatically; you must add the new region to the `regions` field to enable the `WorkerPool` in that region.
     * 
     */
    @InputImport(name="regions")
      private final @Nullable Input<List<WorkerPoolRegionsItem>> regions;

    public Input<List<WorkerPoolRegionsItem>> getRegions() {
        return this.regions == null ? Input.empty() : this.regions;
    }

    /**
     * Configuration to be used for a creating workers in the `WorkerPool`.
     * 
     */
    @InputImport(name="workerConfig")
      private final @Nullable Input<WorkerConfigArgs> workerConfig;

    public Input<WorkerConfigArgs> getWorkerConfig() {
        return this.workerConfig == null ? Input.empty() : this.workerConfig;
    }

    /**
     * Total number of workers to be created across all requested regions.
     * 
     */
    @InputImport(name="workerCount")
      private final @Nullable Input<String> workerCount;

    public Input<String> getWorkerCount() {
        return this.workerCount == null ? Input.empty() : this.workerCount;
    }

    public WorkerPoolArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<List<WorkerPoolRegionsItem>> regions,
        @Nullable Input<WorkerConfigArgs> workerConfig,
        @Nullable Input<String> workerCount) {
        this.name = name;
        this.project = project;
        this.regions = regions;
        this.workerConfig = workerConfig;
        this.workerCount = workerCount;
    }

    private WorkerPoolArgs() {
        this.name = Input.empty();
        this.project = Input.empty();
        this.regions = Input.empty();
        this.workerConfig = Input.empty();
        this.workerCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<List<WorkerPoolRegionsItem>> regions;
        private @Nullable Input<WorkerConfigArgs> workerConfig;
        private @Nullable Input<String> workerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.regions = defaults.regions;
    	      this.workerConfig = defaults.workerConfig;
    	      this.workerCount = defaults.workerCount;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder regions(@Nullable Input<List<WorkerPoolRegionsItem>> regions) {
            this.regions = regions;
            return this;
        }

        public Builder regions(@Nullable List<WorkerPoolRegionsItem> regions) {
            this.regions = Input.ofNullable(regions);
            return this;
        }

        public Builder workerConfig(@Nullable Input<WorkerConfigArgs> workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }

        public Builder workerConfig(@Nullable WorkerConfigArgs workerConfig) {
            this.workerConfig = Input.ofNullable(workerConfig);
            return this;
        }

        public Builder workerCount(@Nullable Input<String> workerCount) {
            this.workerCount = workerCount;
            return this;
        }

        public Builder workerCount(@Nullable String workerCount) {
            this.workerCount = Input.ofNullable(workerCount);
            return this;
        }
        public WorkerPoolArgs build() {
            return new WorkerPoolArgs(name, project, regions, workerConfig, workerCount);
        }
    }
}
