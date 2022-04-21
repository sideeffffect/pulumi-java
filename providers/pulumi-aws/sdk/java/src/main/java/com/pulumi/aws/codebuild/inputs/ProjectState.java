// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.aws.codebuild.inputs.ProjectArtifactsGetArgs;
import com.pulumi.aws.codebuild.inputs.ProjectBuildBatchConfigGetArgs;
import com.pulumi.aws.codebuild.inputs.ProjectCacheGetArgs;
import com.pulumi.aws.codebuild.inputs.ProjectEnvironmentGetArgs;
import com.pulumi.aws.codebuild.inputs.ProjectFileSystemLocationGetArgs;
import com.pulumi.aws.codebuild.inputs.ProjectLogsConfigGetArgs;
import com.pulumi.aws.codebuild.inputs.ProjectSecondaryArtifactGetArgs;
import com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceGetArgs;
import com.pulumi.aws.codebuild.inputs.ProjectSecondarySourceVersionGetArgs;
import com.pulumi.aws.codebuild.inputs.ProjectSourceGetArgs;
import com.pulumi.aws.codebuild.inputs.ProjectVpcConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectState extends com.pulumi.resources.ResourceArgs {

    public static final ProjectState Empty = new ProjectState();

    /**
     * ARN of the CodeBuild project.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="artifacts")
    private @Nullable Output<ProjectArtifactsGetArgs> artifacts;

    public Optional<Output<ProjectArtifactsGetArgs>> artifacts() {
        return Optional.ofNullable(this.artifacts);
    }

    /**
     * Generates a publicly-accessible URL for the projects build badge. Available as `badge_url` attribute when enabled.
     * 
     */
    @Import(name="badgeEnabled")
    private @Nullable Output<Boolean> badgeEnabled;

    public Optional<Output<Boolean>> badgeEnabled() {
        return Optional.ofNullable(this.badgeEnabled);
    }

    /**
     * URL of the build badge when `badge_enabled` is enabled.
     * 
     */
    @Import(name="badgeUrl")
    private @Nullable Output<String> badgeUrl;

    public Optional<Output<String>> badgeUrl() {
        return Optional.ofNullable(this.badgeUrl);
    }

    /**
     * Defines the batch build options for the project.
     * 
     */
    @Import(name="buildBatchConfig")
    private @Nullable Output<ProjectBuildBatchConfigGetArgs> buildBatchConfig;

    public Optional<Output<ProjectBuildBatchConfigGetArgs>> buildBatchConfig() {
        return Optional.ofNullable(this.buildBatchConfig);
    }

    /**
     * Number of minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
     * 
     */
    @Import(name="buildTimeout")
    private @Nullable Output<Integer> buildTimeout;

    public Optional<Output<Integer>> buildTimeout() {
        return Optional.ofNullable(this.buildTimeout);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="cache")
    private @Nullable Output<ProjectCacheGetArgs> cache;

    public Optional<Output<ProjectCacheGetArgs>> cache() {
        return Optional.ofNullable(this.cache);
    }

    /**
     * Specify a maximum number of concurrent builds for the project. The value specified must be greater than 0 and less than the account concurrent running builds limit.
     * 
     */
    @Import(name="concurrentBuildLimit")
    private @Nullable Output<Integer> concurrentBuildLimit;

    public Optional<Output<Integer>> concurrentBuildLimit() {
        return Optional.ofNullable(this.concurrentBuildLimit);
    }

    /**
     * Short description of the project.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project&#39;s build output artifacts.
     * 
     */
    @Import(name="encryptionKey")
    private @Nullable Output<String> encryptionKey;

    public Optional<Output<String>> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<ProjectEnvironmentGetArgs> environment;

    public Optional<Output<ProjectEnvironmentGetArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * A set of file system locations to to mount inside the build. File system locations are documented below.
     * 
     */
    @Import(name="fileSystemLocations")
    private @Nullable Output<List<ProjectFileSystemLocationGetArgs>> fileSystemLocations;

    public Optional<Output<List<ProjectFileSystemLocationGetArgs>>> fileSystemLocations() {
        return Optional.ofNullable(this.fileSystemLocations);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="logsConfig")
    private @Nullable Output<ProjectLogsConfigGetArgs> logsConfig;

    public Optional<Output<ProjectLogsConfigGetArgs>> logsConfig() {
        return Optional.ofNullable(this.logsConfig);
    }

    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the visibility of the project&#39;s builds. Possible values are: `PUBLIC_READ` and `PRIVATE`. Default value is `PRIVATE`.
     * 
     */
    @Import(name="projectVisibility")
    private @Nullable Output<String> projectVisibility;

    public Optional<Output<String>> projectVisibility() {
        return Optional.ofNullable(this.projectVisibility);
    }

    /**
     * The project identifier used with the public build APIs.
     * 
     */
    @Import(name="publicProjectAlias")
    private @Nullable Output<String> publicProjectAlias;

    public Optional<Output<String>> publicProjectAlias() {
        return Optional.ofNullable(this.publicProjectAlias);
    }

    /**
     * Number of minutes, from 5 to 480 (8 hours), a build is allowed to be queued before it times out. The default is 8 hours.
     * 
     */
    @Import(name="queuedTimeout")
    private @Nullable Output<Integer> queuedTimeout;

    public Optional<Output<Integer>> queuedTimeout() {
        return Optional.ofNullable(this.queuedTimeout);
    }

    /**
     * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for the project&#39;s builds.
     * 
     */
    @Import(name="resourceAccessRole")
    private @Nullable Output<String> resourceAccessRole;

    public Optional<Output<String>> resourceAccessRole() {
        return Optional.ofNullable(this.resourceAccessRole);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="secondaryArtifacts")
    private @Nullable Output<List<ProjectSecondaryArtifactGetArgs>> secondaryArtifacts;

    public Optional<Output<List<ProjectSecondaryArtifactGetArgs>>> secondaryArtifacts() {
        return Optional.ofNullable(this.secondaryArtifacts);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="secondarySourceVersions")
    private @Nullable Output<List<ProjectSecondarySourceVersionGetArgs>> secondarySourceVersions;

    public Optional<Output<List<ProjectSecondarySourceVersionGetArgs>>> secondarySourceVersions() {
        return Optional.ofNullable(this.secondarySourceVersions);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="secondarySources")
    private @Nullable Output<List<ProjectSecondarySourceGetArgs>> secondarySources;

    public Optional<Output<List<ProjectSecondarySourceGetArgs>>> secondarySources() {
        return Optional.ofNullable(this.secondarySources);
    }

    /**
     * Specifies the service role ARN for the batch build project.
     * 
     */
    @Import(name="serviceRole")
    private @Nullable Output<String> serviceRole;

    public Optional<Output<String>> serviceRole() {
        return Optional.ofNullable(this.serviceRole);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="source")
    private @Nullable Output<ProjectSourceGetArgs> source;

    public Optional<Output<ProjectSourceGetArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The source version for the corresponding source identifier. See [AWS docs](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ProjectSourceVersion.html#CodeBuild-Type-ProjectSourceVersion-sourceVersion) for more details.
     * 
     */
    @Import(name="sourceVersion")
    private @Nullable Output<String> sourceVersion;

    public Optional<Output<String>> sourceVersion() {
        return Optional.ofNullable(this.sourceVersion);
    }

    /**
     * Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="vpcConfig")
    private @Nullable Output<ProjectVpcConfigGetArgs> vpcConfig;

    public Optional<Output<ProjectVpcConfigGetArgs>> vpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    private ProjectState() {}

    private ProjectState(ProjectState $) {
        this.arn = $.arn;
        this.artifacts = $.artifacts;
        this.badgeEnabled = $.badgeEnabled;
        this.badgeUrl = $.badgeUrl;
        this.buildBatchConfig = $.buildBatchConfig;
        this.buildTimeout = $.buildTimeout;
        this.cache = $.cache;
        this.concurrentBuildLimit = $.concurrentBuildLimit;
        this.description = $.description;
        this.encryptionKey = $.encryptionKey;
        this.environment = $.environment;
        this.fileSystemLocations = $.fileSystemLocations;
        this.logsConfig = $.logsConfig;
        this.name = $.name;
        this.projectVisibility = $.projectVisibility;
        this.publicProjectAlias = $.publicProjectAlias;
        this.queuedTimeout = $.queuedTimeout;
        this.resourceAccessRole = $.resourceAccessRole;
        this.secondaryArtifacts = $.secondaryArtifacts;
        this.secondarySourceVersions = $.secondarySourceVersions;
        this.secondarySources = $.secondarySources;
        this.serviceRole = $.serviceRole;
        this.source = $.source;
        this.sourceVersion = $.sourceVersion;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpcConfig = $.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectState $;

        public Builder() {
            $ = new ProjectState();
        }

        public Builder(ProjectState defaults) {
            $ = new ProjectState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder artifacts(@Nullable Output<ProjectArtifactsGetArgs> artifacts) {
            $.artifacts = artifacts;
            return this;
        }

        public Builder artifacts(ProjectArtifactsGetArgs artifacts) {
            return artifacts(Output.of(artifacts));
        }

        public Builder badgeEnabled(@Nullable Output<Boolean> badgeEnabled) {
            $.badgeEnabled = badgeEnabled;
            return this;
        }

        public Builder badgeEnabled(Boolean badgeEnabled) {
            return badgeEnabled(Output.of(badgeEnabled));
        }

        public Builder badgeUrl(@Nullable Output<String> badgeUrl) {
            $.badgeUrl = badgeUrl;
            return this;
        }

        public Builder badgeUrl(String badgeUrl) {
            return badgeUrl(Output.of(badgeUrl));
        }

        public Builder buildBatchConfig(@Nullable Output<ProjectBuildBatchConfigGetArgs> buildBatchConfig) {
            $.buildBatchConfig = buildBatchConfig;
            return this;
        }

        public Builder buildBatchConfig(ProjectBuildBatchConfigGetArgs buildBatchConfig) {
            return buildBatchConfig(Output.of(buildBatchConfig));
        }

        public Builder buildTimeout(@Nullable Output<Integer> buildTimeout) {
            $.buildTimeout = buildTimeout;
            return this;
        }

        public Builder buildTimeout(Integer buildTimeout) {
            return buildTimeout(Output.of(buildTimeout));
        }

        public Builder cache(@Nullable Output<ProjectCacheGetArgs> cache) {
            $.cache = cache;
            return this;
        }

        public Builder cache(ProjectCacheGetArgs cache) {
            return cache(Output.of(cache));
        }

        public Builder concurrentBuildLimit(@Nullable Output<Integer> concurrentBuildLimit) {
            $.concurrentBuildLimit = concurrentBuildLimit;
            return this;
        }

        public Builder concurrentBuildLimit(Integer concurrentBuildLimit) {
            return concurrentBuildLimit(Output.of(concurrentBuildLimit));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder encryptionKey(@Nullable Output<String> encryptionKey) {
            $.encryptionKey = encryptionKey;
            return this;
        }

        public Builder encryptionKey(String encryptionKey) {
            return encryptionKey(Output.of(encryptionKey));
        }

        public Builder environment(@Nullable Output<ProjectEnvironmentGetArgs> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(ProjectEnvironmentGetArgs environment) {
            return environment(Output.of(environment));
        }

        public Builder fileSystemLocations(@Nullable Output<List<ProjectFileSystemLocationGetArgs>> fileSystemLocations) {
            $.fileSystemLocations = fileSystemLocations;
            return this;
        }

        public Builder fileSystemLocations(List<ProjectFileSystemLocationGetArgs> fileSystemLocations) {
            return fileSystemLocations(Output.of(fileSystemLocations));
        }

        public Builder fileSystemLocations(ProjectFileSystemLocationGetArgs... fileSystemLocations) {
            return fileSystemLocations(List.of(fileSystemLocations));
        }

        public Builder logsConfig(@Nullable Output<ProjectLogsConfigGetArgs> logsConfig) {
            $.logsConfig = logsConfig;
            return this;
        }

        public Builder logsConfig(ProjectLogsConfigGetArgs logsConfig) {
            return logsConfig(Output.of(logsConfig));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder projectVisibility(@Nullable Output<String> projectVisibility) {
            $.projectVisibility = projectVisibility;
            return this;
        }

        public Builder projectVisibility(String projectVisibility) {
            return projectVisibility(Output.of(projectVisibility));
        }

        public Builder publicProjectAlias(@Nullable Output<String> publicProjectAlias) {
            $.publicProjectAlias = publicProjectAlias;
            return this;
        }

        public Builder publicProjectAlias(String publicProjectAlias) {
            return publicProjectAlias(Output.of(publicProjectAlias));
        }

        public Builder queuedTimeout(@Nullable Output<Integer> queuedTimeout) {
            $.queuedTimeout = queuedTimeout;
            return this;
        }

        public Builder queuedTimeout(Integer queuedTimeout) {
            return queuedTimeout(Output.of(queuedTimeout));
        }

        public Builder resourceAccessRole(@Nullable Output<String> resourceAccessRole) {
            $.resourceAccessRole = resourceAccessRole;
            return this;
        }

        public Builder resourceAccessRole(String resourceAccessRole) {
            return resourceAccessRole(Output.of(resourceAccessRole));
        }

        public Builder secondaryArtifacts(@Nullable Output<List<ProjectSecondaryArtifactGetArgs>> secondaryArtifacts) {
            $.secondaryArtifacts = secondaryArtifacts;
            return this;
        }

        public Builder secondaryArtifacts(List<ProjectSecondaryArtifactGetArgs> secondaryArtifacts) {
            return secondaryArtifacts(Output.of(secondaryArtifacts));
        }

        public Builder secondaryArtifacts(ProjectSecondaryArtifactGetArgs... secondaryArtifacts) {
            return secondaryArtifacts(List.of(secondaryArtifacts));
        }

        public Builder secondarySourceVersions(@Nullable Output<List<ProjectSecondarySourceVersionGetArgs>> secondarySourceVersions) {
            $.secondarySourceVersions = secondarySourceVersions;
            return this;
        }

        public Builder secondarySourceVersions(List<ProjectSecondarySourceVersionGetArgs> secondarySourceVersions) {
            return secondarySourceVersions(Output.of(secondarySourceVersions));
        }

        public Builder secondarySourceVersions(ProjectSecondarySourceVersionGetArgs... secondarySourceVersions) {
            return secondarySourceVersions(List.of(secondarySourceVersions));
        }

        public Builder secondarySources(@Nullable Output<List<ProjectSecondarySourceGetArgs>> secondarySources) {
            $.secondarySources = secondarySources;
            return this;
        }

        public Builder secondarySources(List<ProjectSecondarySourceGetArgs> secondarySources) {
            return secondarySources(Output.of(secondarySources));
        }

        public Builder secondarySources(ProjectSecondarySourceGetArgs... secondarySources) {
            return secondarySources(List.of(secondarySources));
        }

        public Builder serviceRole(@Nullable Output<String> serviceRole) {
            $.serviceRole = serviceRole;
            return this;
        }

        public Builder serviceRole(String serviceRole) {
            return serviceRole(Output.of(serviceRole));
        }

        public Builder source(@Nullable Output<ProjectSourceGetArgs> source) {
            $.source = source;
            return this;
        }

        public Builder source(ProjectSourceGetArgs source) {
            return source(Output.of(source));
        }

        public Builder sourceVersion(@Nullable Output<String> sourceVersion) {
            $.sourceVersion = sourceVersion;
            return this;
        }

        public Builder sourceVersion(String sourceVersion) {
            return sourceVersion(Output.of(sourceVersion));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder vpcConfig(@Nullable Output<ProjectVpcConfigGetArgs> vpcConfig) {
            $.vpcConfig = vpcConfig;
            return this;
        }

        public Builder vpcConfig(ProjectVpcConfigGetArgs vpcConfig) {
            return vpcConfig(Output.of(vpcConfig));
        }

        public ProjectState build() {
            return $;
        }
    }

}
