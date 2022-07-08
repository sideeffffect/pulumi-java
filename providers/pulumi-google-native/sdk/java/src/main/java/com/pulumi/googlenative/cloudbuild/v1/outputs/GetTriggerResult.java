// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudbuild.v1.outputs.ApprovalConfigResponse;
import com.pulumi.googlenative.cloudbuild.v1.outputs.BitbucketServerTriggerConfigResponse;
import com.pulumi.googlenative.cloudbuild.v1.outputs.BuildResponse;
import com.pulumi.googlenative.cloudbuild.v1.outputs.GitFileSourceResponse;
import com.pulumi.googlenative.cloudbuild.v1.outputs.GitHubEventsConfigResponse;
import com.pulumi.googlenative.cloudbuild.v1.outputs.GitRepoSourceResponse;
import com.pulumi.googlenative.cloudbuild.v1.outputs.PubsubConfigResponse;
import com.pulumi.googlenative.cloudbuild.v1.outputs.RepoSourceResponse;
import com.pulumi.googlenative.cloudbuild.v1.outputs.WebhookConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTriggerResult {
    /**
     * @return Configuration for manual approval to start a build invocation of this BuildTrigger.
     * 
     */
    private final ApprovalConfigResponse approvalConfig;
    /**
     * @return Autodetect build configuration. The following precedence is used (case insensitive): 1. cloudbuild.yaml 2. cloudbuild.yml 3. cloudbuild.json 4. Dockerfile Currently only available for GitHub App Triggers.
     * 
     */
    private final Boolean autodetect;
    /**
     * @return BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build whenever a Bitbucket Server event is received.
     * 
     */
    private final BitbucketServerTriggerConfigResponse bitbucketServerTriggerConfig;
    /**
     * @return Contents of the build template.
     * 
     */
    private final BuildResponse build;
    /**
     * @return Time when the trigger was created.
     * 
     */
    private final String createTime;
    /**
     * @return Human-readable description of this trigger.
     * 
     */
    private final String description;
    /**
     * @return If true, the trigger will never automatically execute a build.
     * 
     */
    private final Boolean disabled;
    /**
     * @return EventType allows the user to explicitly set the type of event to which this BuildTrigger should respond. This field will be validated against the rest of the configuration if it is set.
     * 
     */
    private final String eventType;
    /**
     * @return Path, from the source root, to the build configuration file (i.e. cloudbuild.yaml).
     * 
     */
    private final String filename;
    /**
     * @return A Common Expression Language string.
     * 
     */
    private final String filter;
    /**
     * @return The file source describing the local or remote Build template.
     * 
     */
    private final GitFileSourceResponse gitFileSource;
    /**
     * @return GitHubEventsConfig describes the configuration of a trigger that creates a build whenever a GitHub event is received. Mutually exclusive with `trigger_template`.
     * 
     */
    private final GitHubEventsConfigResponse github;
    /**
     * @return ignored_files and included_files are file glob matches using https://golang.org/pkg/path/filepath/#Match extended with support for &#34;**&#34;. If ignored_files and changed files are both empty, then they are not used to determine whether or not to trigger a build. If ignored_files is not empty, then we ignore any files that match any of the ignored_file globs. If the change has no files that are outside of the ignored_files globs, then we do not trigger a build.
     * 
     */
    private final List<String> ignoredFiles;
    /**
     * @return If set to INCLUDE_BUILD_LOGS_WITH_STATUS, log url will be shown on GitHub page when build status is final. Setting this field to INCLUDE_BUILD_LOGS_WITH_STATUS for non GitHub triggers results in INVALID_ARGUMENT error.
     * 
     */
    private final String includeBuildLogs;
    /**
     * @return If any of the files altered in the commit pass the ignored_files filter and included_files is empty, then as far as this filter is concerned, we should trigger the build. If any of the files altered in the commit pass the ignored_files filter and included_files is not empty, then we make sure that at least one of those files matches a included_files glob. If not, then we do not trigger a build.
     * 
     */
    private final List<String> includedFiles;
    /**
     * @return User-assigned name of the trigger. Must be unique within the project. Trigger names must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character.
     * 
     */
    private final String name;
    /**
     * @return PubsubConfig describes the configuration of a trigger that creates a build whenever a Pub/Sub message is published.
     * 
     */
    private final PubsubConfigResponse pubsubConfig;
    /**
     * @return The `Trigger` name with format: `projects/{project}/locations/{location}/triggers/{trigger}`, where {trigger} is a unique identifier generated by the service.
     * 
     */
    private final String resourceName;
    /**
     * @return The service account used for all user-controlled operations including UpdateBuildTrigger, RunBuildTrigger, CreateBuild, and CancelBuild. If no service account is set, then the standard Cloud Build service account ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead. Format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}`
     * 
     */
    private final String serviceAccount;
    /**
     * @return The repo and ref of the repository from which to build. This field is used only for those triggers that do not respond to SCM events. Triggers that respond to such events build source at whatever commit caused the event. This field is currently only used by Webhook, Pub/Sub, Manual, and Cron triggers.
     * 
     */
    private final GitRepoSourceResponse sourceToBuild;
    /**
     * @return Substitutions for Build resource. The keys must match the following regular expression: `^_[A-Z0-9_]+$`.
     * 
     */
    private final Map<String,String> substitutions;
    /**
     * @return Tags for annotation of a `BuildTrigger`
     * 
     */
    private final List<String> tags;
    /**
     * @return Template describing the types of source changes to trigger a build. Branch and tag names in trigger templates are interpreted as regular expressions. Any branch or tag change that matches that regular expression will trigger a build. Mutually exclusive with `github`.
     * 
     */
    private final RepoSourceResponse triggerTemplate;
    /**
     * @return WebhookConfig describes the configuration of a trigger that creates a build whenever a webhook is sent to a trigger&#39;s webhook URL.
     * 
     */
    private final WebhookConfigResponse webhookConfig;

    @CustomType.Constructor
    private GetTriggerResult(
        @CustomType.Parameter("approvalConfig") ApprovalConfigResponse approvalConfig,
        @CustomType.Parameter("autodetect") Boolean autodetect,
        @CustomType.Parameter("bitbucketServerTriggerConfig") BitbucketServerTriggerConfigResponse bitbucketServerTriggerConfig,
        @CustomType.Parameter("build") BuildResponse build,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("disabled") Boolean disabled,
        @CustomType.Parameter("eventType") String eventType,
        @CustomType.Parameter("filename") String filename,
        @CustomType.Parameter("filter") String filter,
        @CustomType.Parameter("gitFileSource") GitFileSourceResponse gitFileSource,
        @CustomType.Parameter("github") GitHubEventsConfigResponse github,
        @CustomType.Parameter("ignoredFiles") List<String> ignoredFiles,
        @CustomType.Parameter("includeBuildLogs") String includeBuildLogs,
        @CustomType.Parameter("includedFiles") List<String> includedFiles,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("pubsubConfig") PubsubConfigResponse pubsubConfig,
        @CustomType.Parameter("resourceName") String resourceName,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("sourceToBuild") GitRepoSourceResponse sourceToBuild,
        @CustomType.Parameter("substitutions") Map<String,String> substitutions,
        @CustomType.Parameter("tags") List<String> tags,
        @CustomType.Parameter("triggerTemplate") RepoSourceResponse triggerTemplate,
        @CustomType.Parameter("webhookConfig") WebhookConfigResponse webhookConfig) {
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
        this.includeBuildLogs = includeBuildLogs;
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
     * @return Configuration for manual approval to start a build invocation of this BuildTrigger.
     * 
     */
    public ApprovalConfigResponse approvalConfig() {
        return this.approvalConfig;
    }
    /**
     * @return Autodetect build configuration. The following precedence is used (case insensitive): 1. cloudbuild.yaml 2. cloudbuild.yml 3. cloudbuild.json 4. Dockerfile Currently only available for GitHub App Triggers.
     * 
     */
    public Boolean autodetect() {
        return this.autodetect;
    }
    /**
     * @return BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build whenever a Bitbucket Server event is received.
     * 
     */
    public BitbucketServerTriggerConfigResponse bitbucketServerTriggerConfig() {
        return this.bitbucketServerTriggerConfig;
    }
    /**
     * @return Contents of the build template.
     * 
     */
    public BuildResponse build() {
        return this.build;
    }
    /**
     * @return Time when the trigger was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Human-readable description of this trigger.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return If true, the trigger will never automatically execute a build.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return EventType allows the user to explicitly set the type of event to which this BuildTrigger should respond. This field will be validated against the rest of the configuration if it is set.
     * 
     */
    public String eventType() {
        return this.eventType;
    }
    /**
     * @return Path, from the source root, to the build configuration file (i.e. cloudbuild.yaml).
     * 
     */
    public String filename() {
        return this.filename;
    }
    /**
     * @return A Common Expression Language string.
     * 
     */
    public String filter() {
        return this.filter;
    }
    /**
     * @return The file source describing the local or remote Build template.
     * 
     */
    public GitFileSourceResponse gitFileSource() {
        return this.gitFileSource;
    }
    /**
     * @return GitHubEventsConfig describes the configuration of a trigger that creates a build whenever a GitHub event is received. Mutually exclusive with `trigger_template`.
     * 
     */
    public GitHubEventsConfigResponse github() {
        return this.github;
    }
    /**
     * @return ignored_files and included_files are file glob matches using https://golang.org/pkg/path/filepath/#Match extended with support for &#34;**&#34;. If ignored_files and changed files are both empty, then they are not used to determine whether or not to trigger a build. If ignored_files is not empty, then we ignore any files that match any of the ignored_file globs. If the change has no files that are outside of the ignored_files globs, then we do not trigger a build.
     * 
     */
    public List<String> ignoredFiles() {
        return this.ignoredFiles;
    }
    /**
     * @return If set to INCLUDE_BUILD_LOGS_WITH_STATUS, log url will be shown on GitHub page when build status is final. Setting this field to INCLUDE_BUILD_LOGS_WITH_STATUS for non GitHub triggers results in INVALID_ARGUMENT error.
     * 
     */
    public String includeBuildLogs() {
        return this.includeBuildLogs;
    }
    /**
     * @return If any of the files altered in the commit pass the ignored_files filter and included_files is empty, then as far as this filter is concerned, we should trigger the build. If any of the files altered in the commit pass the ignored_files filter and included_files is not empty, then we make sure that at least one of those files matches a included_files glob. If not, then we do not trigger a build.
     * 
     */
    public List<String> includedFiles() {
        return this.includedFiles;
    }
    /**
     * @return User-assigned name of the trigger. Must be unique within the project. Trigger names must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return PubsubConfig describes the configuration of a trigger that creates a build whenever a Pub/Sub message is published.
     * 
     */
    public PubsubConfigResponse pubsubConfig() {
        return this.pubsubConfig;
    }
    /**
     * @return The `Trigger` name with format: `projects/{project}/locations/{location}/triggers/{trigger}`, where {trigger} is a unique identifier generated by the service.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }
    /**
     * @return The service account used for all user-controlled operations including UpdateBuildTrigger, RunBuildTrigger, CreateBuild, and CancelBuild. If no service account is set, then the standard Cloud Build service account ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead. Format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}`
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return The repo and ref of the repository from which to build. This field is used only for those triggers that do not respond to SCM events. Triggers that respond to such events build source at whatever commit caused the event. This field is currently only used by Webhook, Pub/Sub, Manual, and Cron triggers.
     * 
     */
    public GitRepoSourceResponse sourceToBuild() {
        return this.sourceToBuild;
    }
    /**
     * @return Substitutions for Build resource. The keys must match the following regular expression: `^_[A-Z0-9_]+$`.
     * 
     */
    public Map<String,String> substitutions() {
        return this.substitutions;
    }
    /**
     * @return Tags for annotation of a `BuildTrigger`
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return Template describing the types of source changes to trigger a build. Branch and tag names in trigger templates are interpreted as regular expressions. Any branch or tag change that matches that regular expression will trigger a build. Mutually exclusive with `github`.
     * 
     */
    public RepoSourceResponse triggerTemplate() {
        return this.triggerTemplate;
    }
    /**
     * @return WebhookConfig describes the configuration of a trigger that creates a build whenever a webhook is sent to a trigger&#39;s webhook URL.
     * 
     */
    public WebhookConfigResponse webhookConfig() {
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
        private String includeBuildLogs;
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
    	      this.includeBuildLogs = defaults.includeBuildLogs;
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

        public Builder approvalConfig(ApprovalConfigResponse approvalConfig) {
            this.approvalConfig = Objects.requireNonNull(approvalConfig);
            return this;
        }
        public Builder autodetect(Boolean autodetect) {
            this.autodetect = Objects.requireNonNull(autodetect);
            return this;
        }
        public Builder bitbucketServerTriggerConfig(BitbucketServerTriggerConfigResponse bitbucketServerTriggerConfig) {
            this.bitbucketServerTriggerConfig = Objects.requireNonNull(bitbucketServerTriggerConfig);
            return this;
        }
        public Builder build(BuildResponse build) {
            this.build = Objects.requireNonNull(build);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public Builder eventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }
        public Builder filename(String filename) {
            this.filename = Objects.requireNonNull(filename);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder gitFileSource(GitFileSourceResponse gitFileSource) {
            this.gitFileSource = Objects.requireNonNull(gitFileSource);
            return this;
        }
        public Builder github(GitHubEventsConfigResponse github) {
            this.github = Objects.requireNonNull(github);
            return this;
        }
        public Builder ignoredFiles(List<String> ignoredFiles) {
            this.ignoredFiles = Objects.requireNonNull(ignoredFiles);
            return this;
        }
        public Builder ignoredFiles(String... ignoredFiles) {
            return ignoredFiles(List.of(ignoredFiles));
        }
        public Builder includeBuildLogs(String includeBuildLogs) {
            this.includeBuildLogs = Objects.requireNonNull(includeBuildLogs);
            return this;
        }
        public Builder includedFiles(List<String> includedFiles) {
            this.includedFiles = Objects.requireNonNull(includedFiles);
            return this;
        }
        public Builder includedFiles(String... includedFiles) {
            return includedFiles(List.of(includedFiles));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder pubsubConfig(PubsubConfigResponse pubsubConfig) {
            this.pubsubConfig = Objects.requireNonNull(pubsubConfig);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder sourceToBuild(GitRepoSourceResponse sourceToBuild) {
            this.sourceToBuild = Objects.requireNonNull(sourceToBuild);
            return this;
        }
        public Builder substitutions(Map<String,String> substitutions) {
            this.substitutions = Objects.requireNonNull(substitutions);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder triggerTemplate(RepoSourceResponse triggerTemplate) {
            this.triggerTemplate = Objects.requireNonNull(triggerTemplate);
            return this;
        }
        public Builder webhookConfig(WebhookConfigResponse webhookConfig) {
            this.webhookConfig = Objects.requireNonNull(webhookConfig);
            return this;
        }        public GetTriggerResult build() {
            return new GetTriggerResult(approvalConfig, autodetect, bitbucketServerTriggerConfig, build, createTime, description, disabled, eventType, filename, filter, gitFileSource, github, ignoredFiles, includeBuildLogs, includedFiles, name, pubsubConfig, resourceName, serviceAccount, sourceToBuild, substitutions, tags, triggerTemplate, webhookConfig);
        }
    }
}
