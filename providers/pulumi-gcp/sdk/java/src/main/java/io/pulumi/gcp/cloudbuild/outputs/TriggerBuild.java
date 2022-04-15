// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.cloudbuild.outputs.TriggerBuildArtifacts;
import io.pulumi.gcp.cloudbuild.outputs.TriggerBuildAvailableSecrets;
import io.pulumi.gcp.cloudbuild.outputs.TriggerBuildOptions;
import io.pulumi.gcp.cloudbuild.outputs.TriggerBuildSecret;
import io.pulumi.gcp.cloudbuild.outputs.TriggerBuildSource;
import io.pulumi.gcp.cloudbuild.outputs.TriggerBuildStep;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerBuild {
    /**
     * Artifacts produced by the build that should be uploaded upon successful completion of all build steps.
     * Structure is documented below.
     * 
     */
    private final @Nullable TriggerBuildArtifacts artifacts;
    /**
     * Secrets and secret environment variables.
     * Structure is documented below.
     * 
     */
    private final @Nullable TriggerBuildAvailableSecrets availableSecrets;
    /**
     * A list of images to be pushed upon the successful completion of all build steps.
     * The images will be pushed using the builder service account's credentials.
     * The digests of the pushed images will be stored in the Build resource's results field.
     * If any of the images fail to be pushed, the build is marked FAILURE.
     * 
     */
    private final @Nullable List<String> images;
    /**
     * Google Cloud Storage bucket where logs should be written.
     * Logs file names will be of the format ${logsBucket}/log-${build_id}.txt.
     * 
     */
    private final @Nullable String logsBucket;
    /**
     * Special options for this build.
     * Structure is documented below.
     * 
     */
    private final @Nullable TriggerBuildOptions options;
    /**
     * TTL in queue for this build. If provided and the build is enqueued longer than this value,
     * the build will expire and the build status will be EXPIRED.
     * The TTL starts ticking from createTime.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final @Nullable String queueTtl;
    /**
     * Secrets to decrypt using Cloud Key Management Service.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<TriggerBuildSecret> secrets;
    /**
     * The location of the source files to build.
     * One of `storageSource` or `repoSource` must be provided.
     * Structure is documented below.
     * 
     */
    private final @Nullable TriggerBuildSource source;
    /**
     * The operations to be performed on the workspace.
     * Structure is documented below.
     * 
     */
    private final List<TriggerBuildStep> steps;
    /**
     * Substitutions to use in a triggered build. Should only be used with triggers.run
     * 
     */
    private final @Nullable Map<String,String> substitutions;
    /**
     * Tags for annotation of a Build. These are not docker tags.
     * 
     */
    private final @Nullable List<String> tags;
    /**
     * Time limit for executing this build step. If not defined,
     * the step has no
     * time limit and will be allowed to continue to run until either it
     * completes or the build itself times out.
     * 
     */
    private final @Nullable String timeout;

    @CustomType.Constructor
    private TriggerBuild(
        @CustomType.Parameter("artifacts") @Nullable TriggerBuildArtifacts artifacts,
        @CustomType.Parameter("availableSecrets") @Nullable TriggerBuildAvailableSecrets availableSecrets,
        @CustomType.Parameter("images") @Nullable List<String> images,
        @CustomType.Parameter("logsBucket") @Nullable String logsBucket,
        @CustomType.Parameter("options") @Nullable TriggerBuildOptions options,
        @CustomType.Parameter("queueTtl") @Nullable String queueTtl,
        @CustomType.Parameter("secrets") @Nullable List<TriggerBuildSecret> secrets,
        @CustomType.Parameter("source") @Nullable TriggerBuildSource source,
        @CustomType.Parameter("steps") List<TriggerBuildStep> steps,
        @CustomType.Parameter("substitutions") @Nullable Map<String,String> substitutions,
        @CustomType.Parameter("tags") @Nullable List<String> tags,
        @CustomType.Parameter("timeout") @Nullable String timeout) {
        this.artifacts = artifacts;
        this.availableSecrets = availableSecrets;
        this.images = images;
        this.logsBucket = logsBucket;
        this.options = options;
        this.queueTtl = queueTtl;
        this.secrets = secrets;
        this.source = source;
        this.steps = steps;
        this.substitutions = substitutions;
        this.tags = tags;
        this.timeout = timeout;
    }

    /**
     * Artifacts produced by the build that should be uploaded upon successful completion of all build steps.
     * Structure is documented below.
     * 
    */
    public Optional<TriggerBuildArtifacts> artifacts() {
        return Optional.ofNullable(this.artifacts);
    }
    /**
     * Secrets and secret environment variables.
     * Structure is documented below.
     * 
    */
    public Optional<TriggerBuildAvailableSecrets> availableSecrets() {
        return Optional.ofNullable(this.availableSecrets);
    }
    /**
     * A list of images to be pushed upon the successful completion of all build steps.
     * The images will be pushed using the builder service account's credentials.
     * The digests of the pushed images will be stored in the Build resource's results field.
     * If any of the images fail to be pushed, the build is marked FAILURE.
     * 
    */
    public List<String> images() {
        return this.images == null ? List.of() : this.images;
    }
    /**
     * Google Cloud Storage bucket where logs should be written.
     * Logs file names will be of the format ${logsBucket}/log-${build_id}.txt.
     * 
    */
    public Optional<String> logsBucket() {
        return Optional.ofNullable(this.logsBucket);
    }
    /**
     * Special options for this build.
     * Structure is documented below.
     * 
    */
    public Optional<TriggerBuildOptions> options() {
        return Optional.ofNullable(this.options);
    }
    /**
     * TTL in queue for this build. If provided and the build is enqueued longer than this value,
     * the build will expire and the build status will be EXPIRED.
     * The TTL starts ticking from createTime.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
    */
    public Optional<String> queueTtl() {
        return Optional.ofNullable(this.queueTtl);
    }
    /**
     * Secrets to decrypt using Cloud Key Management Service.
     * Structure is documented below.
     * 
    */
    public List<TriggerBuildSecret> secrets() {
        return this.secrets == null ? List.of() : this.secrets;
    }
    /**
     * The location of the source files to build.
     * One of `storageSource` or `repoSource` must be provided.
     * Structure is documented below.
     * 
    */
    public Optional<TriggerBuildSource> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * The operations to be performed on the workspace.
     * Structure is documented below.
     * 
    */
    public List<TriggerBuildStep> steps() {
        return this.steps;
    }
    /**
     * Substitutions to use in a triggered build. Should only be used with triggers.run
     * 
    */
    public Map<String,String> substitutions() {
        return this.substitutions == null ? Map.of() : this.substitutions;
    }
    /**
     * Tags for annotation of a Build. These are not docker tags.
     * 
    */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * Time limit for executing this build step. If not defined,
     * the step has no
     * time limit and will be allowed to continue to run until either it
     * completes or the build itself times out.
     * 
    */
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuild defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TriggerBuildArtifacts artifacts;
        private @Nullable TriggerBuildAvailableSecrets availableSecrets;
        private @Nullable List<String> images;
        private @Nullable String logsBucket;
        private @Nullable TriggerBuildOptions options;
        private @Nullable String queueTtl;
        private @Nullable List<TriggerBuildSecret> secrets;
        private @Nullable TriggerBuildSource source;
        private List<TriggerBuildStep> steps;
        private @Nullable Map<String,String> substitutions;
        private @Nullable List<String> tags;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuild defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.availableSecrets = defaults.availableSecrets;
    	      this.images = defaults.images;
    	      this.logsBucket = defaults.logsBucket;
    	      this.options = defaults.options;
    	      this.queueTtl = defaults.queueTtl;
    	      this.secrets = defaults.secrets;
    	      this.source = defaults.source;
    	      this.steps = defaults.steps;
    	      this.substitutions = defaults.substitutions;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
        }

        public Builder artifacts(@Nullable TriggerBuildArtifacts artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public Builder availableSecrets(@Nullable TriggerBuildAvailableSecrets availableSecrets) {
            this.availableSecrets = availableSecrets;
            return this;
        }
        public Builder images(@Nullable List<String> images) {
            this.images = images;
            return this;
        }
        public Builder images(String... images) {
            return images(List.of(images));
        }
        public Builder logsBucket(@Nullable String logsBucket) {
            this.logsBucket = logsBucket;
            return this;
        }
        public Builder options(@Nullable TriggerBuildOptions options) {
            this.options = options;
            return this;
        }
        public Builder queueTtl(@Nullable String queueTtl) {
            this.queueTtl = queueTtl;
            return this;
        }
        public Builder secrets(@Nullable List<TriggerBuildSecret> secrets) {
            this.secrets = secrets;
            return this;
        }
        public Builder secrets(TriggerBuildSecret... secrets) {
            return secrets(List.of(secrets));
        }
        public Builder source(@Nullable TriggerBuildSource source) {
            this.source = source;
            return this;
        }
        public Builder steps(List<TriggerBuildStep> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }
        public Builder steps(TriggerBuildStep... steps) {
            return steps(List.of(steps));
        }
        public Builder substitutions(@Nullable Map<String,String> substitutions) {
            this.substitutions = substitutions;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }        public TriggerBuild build() {
            return new TriggerBuild(artifacts, availableSecrets, images, logsBucket, options, queueTtl, secrets, source, steps, substitutions, tags, timeout);
        }
    }
}
