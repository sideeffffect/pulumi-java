// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArgs;
import com.pulumi.gcp.cloudbuild.inputs.TriggerGithubArgs;
import com.pulumi.gcp.cloudbuild.inputs.TriggerPubsubConfigArgs;
import com.pulumi.gcp.cloudbuild.inputs.TriggerTriggerTemplateArgs;
import com.pulumi.gcp.cloudbuild.inputs.TriggerWebhookConfigArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerArgs extends ResourceArgs {

    public static final TriggerArgs Empty = new TriggerArgs();

    /**
     * Contents of the build template. Either a filename or build template must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="build")
    private @Nullable Output<TriggerBuildArgs> build;

    /**
     * @return Contents of the build template. Either a filename or build template must be provided.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TriggerBuildArgs>> build() {
        return Optional.ofNullable(this.build);
    }

    /**
     * Human-readable description of the trigger.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Human-readable description of the trigger.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether the trigger is disabled or not. If true, the trigger will never result in a build.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Whether the trigger is disabled or not. If true, the trigger will never result in a build.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * Path, from the source root, to a file whose contents is used for the template. Either a filename or build template must be provided.
     * 
     */
    @Import(name="filename")
    private @Nullable Output<String> filename;

    /**
     * @return Path, from the source root, to a file whose contents is used for the template. Either a filename or build template must be provided.
     * 
     */
    public Optional<Output<String>> filename() {
        return Optional.ofNullable(this.filename);
    }

    /**
     * Describes the configuration of a trigger that creates a build whenever a GitHub event is received.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="github")
    private @Nullable Output<TriggerGithubArgs> github;

    /**
     * @return Describes the configuration of a trigger that creates a build whenever a GitHub event is received.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TriggerGithubArgs>> github() {
        return Optional.ofNullable(this.github);
    }

    /**
     * ignoredFiles and includedFiles are file glob matches using https://golang.org/pkg/path/filepath/#Match
     * extended with support for `**`.
     * If ignoredFiles and changed files are both empty, then they are not
     * used to determine whether or not to trigger a build.
     * If ignoredFiles is not empty, then we ignore any files that match any
     * of the ignored_file globs. If the change has no files that are outside
     * of the ignoredFiles globs, then we do not trigger a build.
     * 
     */
    @Import(name="ignoredFiles")
    private @Nullable Output<List<String>> ignoredFiles;

    /**
     * @return ignoredFiles and includedFiles are file glob matches using https://golang.org/pkg/path/filepath/#Match
     * extended with support for `**`.
     * If ignoredFiles and changed files are both empty, then they are not
     * used to determine whether or not to trigger a build.
     * If ignoredFiles is not empty, then we ignore any files that match any
     * of the ignored_file globs. If the change has no files that are outside
     * of the ignoredFiles globs, then we do not trigger a build.
     * 
     */
    public Optional<Output<List<String>>> ignoredFiles() {
        return Optional.ofNullable(this.ignoredFiles);
    }

    /**
     * ignoredFiles and includedFiles are file glob matches using https://golang.org/pkg/path/filepath/#Match
     * extended with support for `**`.
     * If any of the files altered in the commit pass the ignoredFiles filter
     * and includedFiles is empty, then as far as this filter is concerned, we
     * should trigger the build.
     * If any of the files altered in the commit pass the ignoredFiles filter
     * and includedFiles is not empty, then we make sure that at least one of
     * those files matches a includedFiles glob. If not, then we do not trigger
     * a build.
     * 
     */
    @Import(name="includedFiles")
    private @Nullable Output<List<String>> includedFiles;

    /**
     * @return ignoredFiles and includedFiles are file glob matches using https://golang.org/pkg/path/filepath/#Match
     * extended with support for `**`.
     * If any of the files altered in the commit pass the ignoredFiles filter
     * and includedFiles is empty, then as far as this filter is concerned, we
     * should trigger the build.
     * If any of the files altered in the commit pass the ignoredFiles filter
     * and includedFiles is not empty, then we make sure that at least one of
     * those files matches a includedFiles glob. If not, then we do not trigger
     * a build.
     * 
     */
    public Optional<Output<List<String>>> includedFiles() {
        return Optional.ofNullable(this.includedFiles);
    }

    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * PubsubConfig describes the configuration of a trigger that creates
     * a build whenever a Pub/Sub message is published.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="pubsubConfig")
    private @Nullable Output<TriggerPubsubConfigArgs> pubsubConfig;

    /**
     * @return PubsubConfig describes the configuration of a trigger that creates
     * a build whenever a Pub/Sub message is published.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TriggerPubsubConfigArgs>> pubsubConfig() {
        return Optional.ofNullable(this.pubsubConfig);
    }

    /**
     * The service account used for all user-controlled operations including
     * triggers.patch, triggers.run, builds.create, and builds.cancel.
     * If no service account is set, then the standard Cloud Build service account
     * ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead.
     * Format: projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return The service account used for all user-controlled operations including
     * triggers.patch, triggers.run, builds.create, and builds.cancel.
     * If no service account is set, then the standard Cloud Build service account
     * ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead.
     * Format: projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Substitutions to use in a triggered build. Should only be used with triggers.run
     * 
     */
    @Import(name="substitutions")
    private @Nullable Output<Map<String,String>> substitutions;

    /**
     * @return Substitutions to use in a triggered build. Should only be used with triggers.run
     * 
     */
    public Optional<Output<Map<String,String>>> substitutions() {
        return Optional.ofNullable(this.substitutions);
    }

    /**
     * Tags for annotation of a Build. These are not docker tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags for annotation of a Build. These are not docker tags.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Template describing the types of source changes to trigger a build.
     * Branch and tag names in trigger templates are interpreted as regular
     * expressions. Any branch or tag change that matches that regular
     * expression will trigger a build.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="triggerTemplate")
    private @Nullable Output<TriggerTriggerTemplateArgs> triggerTemplate;

    /**
     * @return Template describing the types of source changes to trigger a build.
     * Branch and tag names in trigger templates are interpreted as regular
     * expressions. Any branch or tag change that matches that regular
     * expression will trigger a build.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TriggerTriggerTemplateArgs>> triggerTemplate() {
        return Optional.ofNullable(this.triggerTemplate);
    }

    /**
     * WebhookConfig describes the configuration of a trigger that creates
     * a build whenever a webhook is sent to a trigger&#39;s webhook URL.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="webhookConfig")
    private @Nullable Output<TriggerWebhookConfigArgs> webhookConfig;

    /**
     * @return WebhookConfig describes the configuration of a trigger that creates
     * a build whenever a webhook is sent to a trigger&#39;s webhook URL.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TriggerWebhookConfigArgs>> webhookConfig() {
        return Optional.ofNullable(this.webhookConfig);
    }

    private TriggerArgs() {}

    private TriggerArgs(TriggerArgs $) {
        this.build = $.build;
        this.description = $.description;
        this.disabled = $.disabled;
        this.filename = $.filename;
        this.github = $.github;
        this.ignoredFiles = $.ignoredFiles;
        this.includedFiles = $.includedFiles;
        this.name = $.name;
        this.project = $.project;
        this.pubsubConfig = $.pubsubConfig;
        this.serviceAccount = $.serviceAccount;
        this.substitutions = $.substitutions;
        this.tags = $.tags;
        this.triggerTemplate = $.triggerTemplate;
        this.webhookConfig = $.webhookConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerArgs $;

        public Builder() {
            $ = new TriggerArgs();
        }

        public Builder(TriggerArgs defaults) {
            $ = new TriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param build Contents of the build template. Either a filename or build template must be provided.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder build(@Nullable Output<TriggerBuildArgs> build) {
            $.build = build;
            return this;
        }

        /**
         * @param build Contents of the build template. Either a filename or build template must be provided.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder build(TriggerBuildArgs build) {
            return build(Output.of(build));
        }

        /**
         * @param description Human-readable description of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Human-readable description of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disabled Whether the trigger is disabled or not. If true, the trigger will never result in a build.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Whether the trigger is disabled or not. If true, the trigger will never result in a build.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param filename Path, from the source root, to a file whose contents is used for the template. Either a filename or build template must be provided.
         * 
         * @return builder
         * 
         */
        public Builder filename(@Nullable Output<String> filename) {
            $.filename = filename;
            return this;
        }

        /**
         * @param filename Path, from the source root, to a file whose contents is used for the template. Either a filename or build template must be provided.
         * 
         * @return builder
         * 
         */
        public Builder filename(String filename) {
            return filename(Output.of(filename));
        }

        /**
         * @param github Describes the configuration of a trigger that creates a build whenever a GitHub event is received.
         * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder github(@Nullable Output<TriggerGithubArgs> github) {
            $.github = github;
            return this;
        }

        /**
         * @param github Describes the configuration of a trigger that creates a build whenever a GitHub event is received.
         * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder github(TriggerGithubArgs github) {
            return github(Output.of(github));
        }

        /**
         * @param ignoredFiles ignoredFiles and includedFiles are file glob matches using https://golang.org/pkg/path/filepath/#Match
         * extended with support for `**`.
         * If ignoredFiles and changed files are both empty, then they are not
         * used to determine whether or not to trigger a build.
         * If ignoredFiles is not empty, then we ignore any files that match any
         * of the ignored_file globs. If the change has no files that are outside
         * of the ignoredFiles globs, then we do not trigger a build.
         * 
         * @return builder
         * 
         */
        public Builder ignoredFiles(@Nullable Output<List<String>> ignoredFiles) {
            $.ignoredFiles = ignoredFiles;
            return this;
        }

        /**
         * @param ignoredFiles ignoredFiles and includedFiles are file glob matches using https://golang.org/pkg/path/filepath/#Match
         * extended with support for `**`.
         * If ignoredFiles and changed files are both empty, then they are not
         * used to determine whether or not to trigger a build.
         * If ignoredFiles is not empty, then we ignore any files that match any
         * of the ignored_file globs. If the change has no files that are outside
         * of the ignoredFiles globs, then we do not trigger a build.
         * 
         * @return builder
         * 
         */
        public Builder ignoredFiles(List<String> ignoredFiles) {
            return ignoredFiles(Output.of(ignoredFiles));
        }

        /**
         * @param ignoredFiles ignoredFiles and includedFiles are file glob matches using https://golang.org/pkg/path/filepath/#Match
         * extended with support for `**`.
         * If ignoredFiles and changed files are both empty, then they are not
         * used to determine whether or not to trigger a build.
         * If ignoredFiles is not empty, then we ignore any files that match any
         * of the ignored_file globs. If the change has no files that are outside
         * of the ignoredFiles globs, then we do not trigger a build.
         * 
         * @return builder
         * 
         */
        public Builder ignoredFiles(String... ignoredFiles) {
            return ignoredFiles(List.of(ignoredFiles));
        }

        /**
         * @param includedFiles ignoredFiles and includedFiles are file glob matches using https://golang.org/pkg/path/filepath/#Match
         * extended with support for `**`.
         * If any of the files altered in the commit pass the ignoredFiles filter
         * and includedFiles is empty, then as far as this filter is concerned, we
         * should trigger the build.
         * If any of the files altered in the commit pass the ignoredFiles filter
         * and includedFiles is not empty, then we make sure that at least one of
         * those files matches a includedFiles glob. If not, then we do not trigger
         * a build.
         * 
         * @return builder
         * 
         */
        public Builder includedFiles(@Nullable Output<List<String>> includedFiles) {
            $.includedFiles = includedFiles;
            return this;
        }

        /**
         * @param includedFiles ignoredFiles and includedFiles are file glob matches using https://golang.org/pkg/path/filepath/#Match
         * extended with support for `**`.
         * If any of the files altered in the commit pass the ignoredFiles filter
         * and includedFiles is empty, then as far as this filter is concerned, we
         * should trigger the build.
         * If any of the files altered in the commit pass the ignoredFiles filter
         * and includedFiles is not empty, then we make sure that at least one of
         * those files matches a includedFiles glob. If not, then we do not trigger
         * a build.
         * 
         * @return builder
         * 
         */
        public Builder includedFiles(List<String> includedFiles) {
            return includedFiles(Output.of(includedFiles));
        }

        /**
         * @param includedFiles ignoredFiles and includedFiles are file glob matches using https://golang.org/pkg/path/filepath/#Match
         * extended with support for `**`.
         * If any of the files altered in the commit pass the ignoredFiles filter
         * and includedFiles is empty, then as far as this filter is concerned, we
         * should trigger the build.
         * If any of the files altered in the commit pass the ignoredFiles filter
         * and includedFiles is not empty, then we make sure that at least one of
         * those files matches a includedFiles glob. If not, then we do not trigger
         * a build.
         * 
         * @return builder
         * 
         */
        public Builder includedFiles(String... includedFiles) {
            return includedFiles(List.of(includedFiles));
        }

        /**
         * @param name Name of the volume to mount.
         * Volume names must be unique per build step and must be valid names for Docker volumes.
         * Each named volume must be used by at least two build steps.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the volume to mount.
         * Volume names must be unique per build step and must be valid names for Docker volumes.
         * Each named volume must be used by at least two build steps.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param pubsubConfig PubsubConfig describes the configuration of a trigger that creates
         * a build whenever a Pub/Sub message is published.
         * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pubsubConfig(@Nullable Output<TriggerPubsubConfigArgs> pubsubConfig) {
            $.pubsubConfig = pubsubConfig;
            return this;
        }

        /**
         * @param pubsubConfig PubsubConfig describes the configuration of a trigger that creates
         * a build whenever a Pub/Sub message is published.
         * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pubsubConfig(TriggerPubsubConfigArgs pubsubConfig) {
            return pubsubConfig(Output.of(pubsubConfig));
        }

        /**
         * @param serviceAccount The service account used for all user-controlled operations including
         * triggers.patch, triggers.run, builds.create, and builds.cancel.
         * If no service account is set, then the standard Cloud Build service account
         * ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead.
         * Format: projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount The service account used for all user-controlled operations including
         * triggers.patch, triggers.run, builds.create, and builds.cancel.
         * If no service account is set, then the standard Cloud Build service account
         * ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead.
         * Format: projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param substitutions Substitutions to use in a triggered build. Should only be used with triggers.run
         * 
         * @return builder
         * 
         */
        public Builder substitutions(@Nullable Output<Map<String,String>> substitutions) {
            $.substitutions = substitutions;
            return this;
        }

        /**
         * @param substitutions Substitutions to use in a triggered build. Should only be used with triggers.run
         * 
         * @return builder
         * 
         */
        public Builder substitutions(Map<String,String> substitutions) {
            return substitutions(Output.of(substitutions));
        }

        /**
         * @param tags Tags for annotation of a Build. These are not docker tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags for annotation of a Build. These are not docker tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags for annotation of a Build. These are not docker tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param triggerTemplate Template describing the types of source changes to trigger a build.
         * Branch and tag names in trigger templates are interpreted as regular
         * expressions. Any branch or tag change that matches that regular
         * expression will trigger a build.
         * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder triggerTemplate(@Nullable Output<TriggerTriggerTemplateArgs> triggerTemplate) {
            $.triggerTemplate = triggerTemplate;
            return this;
        }

        /**
         * @param triggerTemplate Template describing the types of source changes to trigger a build.
         * Branch and tag names in trigger templates are interpreted as regular
         * expressions. Any branch or tag change that matches that regular
         * expression will trigger a build.
         * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder triggerTemplate(TriggerTriggerTemplateArgs triggerTemplate) {
            return triggerTemplate(Output.of(triggerTemplate));
        }

        /**
         * @param webhookConfig WebhookConfig describes the configuration of a trigger that creates
         * a build whenever a webhook is sent to a trigger&#39;s webhook URL.
         * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder webhookConfig(@Nullable Output<TriggerWebhookConfigArgs> webhookConfig) {
            $.webhookConfig = webhookConfig;
            return this;
        }

        /**
         * @param webhookConfig WebhookConfig describes the configuration of a trigger that creates
         * a build whenever a webhook is sent to a trigger&#39;s webhook URL.
         * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder webhookConfig(TriggerWebhookConfigArgs webhookConfig) {
            return webhookConfig(Output.of(webhookConfig));
        }

        public TriggerArgs build() {
            return $;
        }
    }

}
