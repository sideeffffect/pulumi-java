// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudbuild_v1.outputs.ApprovalConfigResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.BitbucketServerTriggerConfigResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.BuildResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.GitFileSourceResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.GitHubEventsConfigResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.GitRepoSourceResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.PubsubConfigResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.RepoSourceResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.WebhookConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetTriggerResult {
    /**
     * Configuration for manual approval to start a build invocation of this BuildTrigger.
     * 
     */
    private final ApprovalConfigResponse approvalConfig;
    /**
     * Autodetect build configuration. The following precedence is used (case insensitive): 1. cloudbuild.yaml 2. cloudbuild.yml 3. cloudbuild.json 4. Dockerfile Currently only available for GitHub App Triggers.
     * 
     */
    private final Boolean autodetect;
    /**
     * BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build whenever a Bitbucket Server event is received.
     * 
     */
    private final BitbucketServerTriggerConfigResponse bitbucketServerTriggerConfig;
    /**
     * Contents of the build template.
     * 
     */
    private final BuildResponse build;
    /**
     * Time when the trigger was created.
     * 
     */
    private final String createTime;
    /**
     * Human-readable description of this trigger.
     * 
     */
    private final String description;
    /**
     * If true, the trigger will never automatically execute a build.
     * 
     */
    private final Boolean disabled;
    /**
     * EventType allows the user to explicitly set the type of event to which this BuildTrigger should respond. This field will be validated against the rest of the configuration if it is set.
     * 
     */
    private final String eventType;
    /**
     * Path, from the source root, to the build configuration file (i.e. cloudbuild.yaml).
     * 
     */
    private final String filename;
    /**
     * A Common Expression Language string.
     * 
     */
    private final String filter;
    /**
     * The file source describing the local or remote Build template.
     * 
     */
    private final GitFileSourceResponse gitFileSource;
    /**
     * GitHubEventsConfig describes the configuration of a trigger that creates a build whenever a GitHub event is received. Mutually exclusive with `trigger_template`.
     * 
     */
    private final GitHubEventsConfigResponse github;
    /**
     * ignored_files and included_files are file glob matches using https://golang.org/pkg/path/filepath/#Match extended with support for "**". If ignored_files and changed files are both empty, then they are not used to determine whether or not to trigger a build. If ignored_files is not empty, then we ignore any files that match any of the ignored_file globs. If the change has no files that are outside of the ignored_files globs, then we do not trigger a build.
     * 
     */
    private final List<String> ignoredFiles;
    /**
     * If any of the files altered in the commit pass the ignored_files filter and included_files is empty, then as far as this filter is concerned, we should trigger the build. If any of the files altered in the commit pass the ignored_files filter and included_files is not empty, then we make sure that at least one of those files matches a included_files glob. If not, then we do not trigger a build.
     * 
     */
    private final List<String> includedFiles;
    /**
     * User-assigned name of the trigger. Must be unique within the project. Trigger names must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character.
     * 
     */
    private final String name;
    /**
     * PubsubConfig describes the configuration of a trigger that creates a build whenever a Pub/Sub message is published.
     * 
     */
    private final PubsubConfigResponse pubsubConfig;
    /**
     * The `Trigger` name with format: `projects/{project}/locations/{location}/triggers/{trigger}`, where {trigger} is a unique identifier generated by the service.
     * 
     */
    private final String resourceName;
    /**
     * The service account used for all user-controlled operations including UpdateBuildTrigger, RunBuildTrigger, CreateBuild, and CancelBuild. If no service account is set, then the standard Cloud Build service account ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead. Format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}`
     * 
     */
    private final String serviceAccount;
    /**
     * The repo and ref of the repository from which to build. This field is used only for those triggers that do not respond to SCM events. Triggers that respond to such events build source at whatever commit caused the event. This field is currently only used by Webhook, Pub/Sub, Manual, and Cron triggers.
     * 
     */
    private final GitRepoSourceResponse sourceToBuild;
    /**
     * Substitutions for Build resource. The keys must match the following regular expression: `^_[A-Z0-9_]+$`.
     * 
     */
    private final Map<String,String> substitutions;
    /**
     * Tags for annotation of a `BuildTrigger`
     * 
     */
    private final List<String> tags;
    /**
     * Template describing the types of source changes to trigger a build. Branch and tag names in trigger templates are interpreted as regular expressions. Any branch or tag change that matches that regular expression will trigger a build. Mutually exclusive with `github`.
     * 
     */
    private final RepoSourceResponse triggerTemplate;
    /**
     * WebhookConfig describes the configuration of a trigger that creates a build whenever a webhook is sent to a trigger's webhook URL.
     * 
     */
    private final WebhookConfigResponse webhookConfig;

    @OutputCustomType.Constructor({"approvalConfig","autodetect","bitbucketServerTriggerConfig","build","createTime","description","disabled","eventType","filename","filter","gitFileSource","github","ignoredFiles","includedFiles","name","pubsubConfig","resourceName","serviceAccount","sourceToBuild","substitutions","tags","triggerTemplate","webhookConfig"})
    private GetTriggerResult(
        ApprovalConfigResponse approvalConfig,
        Boolean autodetect,
        BitbucketServerTriggerConfigResponse bitbucketServerTriggerConfig,
        BuildResponse build,
        String createTime,
        String description,
        Boolean disabled,
        String eventType,
        String filename,
        String filter,
        GitFileSourceResponse gitFileSource,
        GitHubEventsConfigResponse github,
        List<String> ignoredFiles,
        List<String> includedFiles,
        String name,
        PubsubConfigResponse pubsubConfig,
        String resourceName,
        String serviceAccount,
        GitRepoSourceResponse sourceToBuild,
        Map<String,String> substitutions,
        List<String> tags,
        RepoSourceResponse triggerTemplate,
        WebhookConfigResponse webhookConfig) {
        this.approvalConfig = approvalConfig;
        this.autodetect = autodetect;
        this.bitbucketServerTriggerConfig = bitbucketServerTriggerConfig;
        this.build = build;
        this.createTime = createTime;
        this.description = description;
        this.disabled = disabled;
        this.eventType = eventType;
        this.filename = filename;
        this.filter = filter;
        this.gitFileSource = gitFileSource;
        this.github = github;
        this.ignoredFiles = ignoredFiles;
        this.includedFiles = includedFiles;
        this.name = name;
        this.pubsubConfig = pubsubConfig;
        this.resourceName = resourceName;
        this.serviceAccount = serviceAccount;
        this.sourceToBuild = sourceToBuild;
        this.substitutions = substitutions;
        this.tags = tags;
        this.triggerTemplate = triggerTemplate;
        this.webhookConfig = webhookConfig;
    }

    /**
     * Configuration for manual approval to start a build invocation of this BuildTrigger.
     * 
    */
    public ApprovalConfigResponse getApprovalConfig() {
        return this.approvalConfig;
    }
    /**
     * Autodetect build configuration. The following precedence is used (case insensitive): 1. cloudbuild.yaml 2. cloudbuild.yml 3. cloudbuild.json 4. Dockerfile Currently only available for GitHub App Triggers.
     * 
    */
    public Boolean getAutodetect() {
        return this.autodetect;
    }
    /**
     * BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build whenever a Bitbucket Server event is received.
     * 
    */
    public BitbucketServerTriggerConfigResponse getBitbucketServerTriggerConfig() {
        return this.bitbucketServerTriggerConfig;
    }
    /**
     * Contents of the build template.
     * 
    */
    public BuildResponse getBuild() {
        return this.build;
    }
    /**
     * Time when the trigger was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Human-readable description of this trigger.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * If true, the trigger will never automatically execute a build.
     * 
    */
    public Boolean getDisabled() {
        return this.disabled;
    }
    /**
     * EventType allows the user to explicitly set the type of event to which this BuildTrigger should respond. This field will be validated against the rest of the configuration if it is set.
     * 
    */
    public String getEventType() {
        return this.eventType;
    }
    /**
     * Path, from the source root, to the build configuration file (i.e. cloudbuild.yaml).
     * 
    */
    public String getFilename() {
        return this.filename;
    }
    /**
     * A Common Expression Language string.
     * 
    */
    public String getFilter() {
        return this.filter;
    }
    /**
     * The file source describing the local or remote Build template.
     * 
    */
    public GitFileSourceResponse getGitFileSource() {
        return this.gitFileSource;
    }
    /**
     * GitHubEventsConfig describes the configuration of a trigger that creates a build whenever a GitHub event is received. Mutually exclusive with `trigger_template`.
     * 
    */
    public GitHubEventsConfigResponse getGithub() {
        return this.github;
    }
    /**
     * ignored_files and included_files are file glob matches using https://golang.org/pkg/path/filepath/#Match extended with support for "**". If ignored_files and changed files are both empty, then they are not used to determine whether or not to trigger a build. If ignored_files is not empty, then we ignore any files that match any of the ignored_file globs. If the change has no files that are outside of the ignored_files globs, then we do not trigger a build.
     * 
    */
    public List<String> getIgnoredFiles() {
        return this.ignoredFiles;
    }
    /**
     * If any of the files altered in the commit pass the ignored_files filter and included_files is empty, then as far as this filter is concerned, we should trigger the build. If any of the files altered in the commit pass the ignored_files filter and included_files is not empty, then we make sure that at least one of those files matches a included_files glob. If not, then we do not trigger a build.
     * 
    */
    public List<String> getIncludedFiles() {
        return this.includedFiles;
    }
    /**
     * User-assigned name of the trigger. Must be unique within the project. Trigger names must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * PubsubConfig describes the configuration of a trigger that creates a build whenever a Pub/Sub message is published.
     * 
    */
    public PubsubConfigResponse getPubsubConfig() {
        return this.pubsubConfig;
    }
    /**
     * The `Trigger` name with format: `projects/{project}/locations/{location}/triggers/{trigger}`, where {trigger} is a unique identifier generated by the service.
     * 
    */
    public String getPropResourceName() {
        return this.resourceName;
    }
    /**
     * The service account used for all user-controlled operations including UpdateBuildTrigger, RunBuildTrigger, CreateBuild, and CancelBuild. If no service account is set, then the standard Cloud Build service account ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead. Format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}`
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * The repo and ref of the repository from which to build. This field is used only for those triggers that do not respond to SCM events. Triggers that respond to such events build source at whatever commit caused the event. This field is currently only used by Webhook, Pub/Sub, Manual, and Cron triggers.
     * 
    */
    public GitRepoSourceResponse getSourceToBuild() {
        return this.sourceToBuild;
    }
    /**
     * Substitutions for Build resource. The keys must match the following regular expression: `^_[A-Z0-9_]+$`.
     * 
    */
    public Map<String,String> getSubstitutions() {
        return this.substitutions;
    }
    /**
     * Tags for annotation of a `BuildTrigger`
     * 
    */
    public List<String> getTags() {
        return this.tags;
    }
    /**
     * Template describing the types of source changes to trigger a build. Branch and tag names in trigger templates are interpreted as regular expressions. Any branch or tag change that matches that regular expression will trigger a build. Mutually exclusive with `github`.
     * 
    */
    public RepoSourceResponse getTriggerTemplate() {
        return this.triggerTemplate;
    }
    /**
     * WebhookConfig describes the configuration of a trigger that creates a build whenever a webhook is sent to a trigger's webhook URL.
     * 
    */
    public WebhookConfigResponse getWebhookConfig() {
        return this.webhookConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApprovalConfigResponse approvalConfig;
        private Boolean autodetect;
        private BitbucketServerTriggerConfigResponse bitbucketServerTriggerConfig;
        private BuildResponse build;
        private String createTime;
        private String description;
        private Boolean disabled;
        private String eventType;
        private String filename;
        private String filter;
        private GitFileSourceResponse gitFileSource;
        private GitHubEventsConfigResponse github;
        private List<String> ignoredFiles;
        private List<String> includedFiles;
        private String name;
        private PubsubConfigResponse pubsubConfig;
        private String resourceName;
        private String serviceAccount;
        private GitRepoSourceResponse sourceToBuild;
        private Map<String,String> substitutions;
        private List<String> tags;
        private RepoSourceResponse triggerTemplate;
        private WebhookConfigResponse webhookConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTriggerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalConfig = defaults.approvalConfig;
    	      this.autodetect = defaults.autodetect;
    	      this.bitbucketServerTriggerConfig = defaults.bitbucketServerTriggerConfig;
    	      this.build = defaults.build;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.eventType = defaults.eventType;
    	      this.filename = defaults.filename;
    	      this.filter = defaults.filter;
    	      this.gitFileSource = defaults.gitFileSource;
    	      this.github = defaults.github;
    	      this.ignoredFiles = defaults.ignoredFiles;
    	      this.includedFiles = defaults.includedFiles;
    	      this.name = defaults.name;
    	      this.pubsubConfig = defaults.pubsubConfig;
    	      this.resourceName = defaults.resourceName;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.sourceToBuild = defaults.sourceToBuild;
    	      this.substitutions = defaults.substitutions;
    	      this.tags = defaults.tags;
    	      this.triggerTemplate = defaults.triggerTemplate;
    	      this.webhookConfig = defaults.webhookConfig;
        }

        public Builder setApprovalConfig(ApprovalConfigResponse approvalConfig) {
            this.approvalConfig = Objects.requireNonNull(approvalConfig);
            return this;
        }

        public Builder setAutodetect(Boolean autodetect) {
            this.autodetect = Objects.requireNonNull(autodetect);
            return this;
        }

        public Builder setBitbucketServerTriggerConfig(BitbucketServerTriggerConfigResponse bitbucketServerTriggerConfig) {
            this.bitbucketServerTriggerConfig = Objects.requireNonNull(bitbucketServerTriggerConfig);
            return this;
        }

        public Builder setBuild(BuildResponse build) {
            this.build = Objects.requireNonNull(build);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder setEventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }

        public Builder setFilename(String filename) {
            this.filename = Objects.requireNonNull(filename);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setGitFileSource(GitFileSourceResponse gitFileSource) {
            this.gitFileSource = Objects.requireNonNull(gitFileSource);
            return this;
        }

        public Builder setGithub(GitHubEventsConfigResponse github) {
            this.github = Objects.requireNonNull(github);
            return this;
        }

        public Builder setIgnoredFiles(List<String> ignoredFiles) {
            this.ignoredFiles = Objects.requireNonNull(ignoredFiles);
            return this;
        }

        public Builder setIncludedFiles(List<String> includedFiles) {
            this.includedFiles = Objects.requireNonNull(includedFiles);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPubsubConfig(PubsubConfigResponse pubsubConfig) {
            this.pubsubConfig = Objects.requireNonNull(pubsubConfig);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setSourceToBuild(GitRepoSourceResponse sourceToBuild) {
            this.sourceToBuild = Objects.requireNonNull(sourceToBuild);
            return this;
        }

        public Builder setSubstitutions(Map<String,String> substitutions) {
            this.substitutions = Objects.requireNonNull(substitutions);
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setTriggerTemplate(RepoSourceResponse triggerTemplate) {
            this.triggerTemplate = Objects.requireNonNull(triggerTemplate);
            return this;
        }

        public Builder setWebhookConfig(WebhookConfigResponse webhookConfig) {
            this.webhookConfig = Objects.requireNonNull(webhookConfig);
            return this;
        }
        public GetTriggerResult build() {
            return new GetTriggerResult(approvalConfig, autodetect, bitbucketServerTriggerConfig, build, createTime, description, disabled, eventType, filename, filter, gitFileSource, github, ignoredFiles, includedFiles, name, pubsubConfig, resourceName, serviceAccount, sourceToBuild, substitutions, tags, triggerTemplate, webhookConfig);
        }
    }
}
