// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.amplify;

import com.pulumi.awsnative.amplify.inputs.AppAutoBranchCreationConfigArgs;
import com.pulumi.awsnative.amplify.inputs.AppBasicAuthConfigArgs;
import com.pulumi.awsnative.amplify.inputs.AppCustomRuleArgs;
import com.pulumi.awsnative.amplify.inputs.AppEnvironmentVariableArgs;
import com.pulumi.awsnative.amplify.inputs.AppTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppArgs extends ResourceArgs {

    public static final AppArgs Empty = new AppArgs();

    @Import(name="accessToken")
    private @Nullable Output<String> accessToken;

    public Optional<Output<String>> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }

    @Import(name="autoBranchCreationConfig")
    private @Nullable Output<AppAutoBranchCreationConfigArgs> autoBranchCreationConfig;

    public Optional<Output<AppAutoBranchCreationConfigArgs>> autoBranchCreationConfig() {
        return Optional.ofNullable(this.autoBranchCreationConfig);
    }

    @Import(name="basicAuthConfig")
    private @Nullable Output<AppBasicAuthConfigArgs> basicAuthConfig;

    public Optional<Output<AppBasicAuthConfigArgs>> basicAuthConfig() {
        return Optional.ofNullable(this.basicAuthConfig);
    }

    @Import(name="buildSpec")
    private @Nullable Output<String> buildSpec;

    public Optional<Output<String>> buildSpec() {
        return Optional.ofNullable(this.buildSpec);
    }

    @Import(name="customHeaders")
    private @Nullable Output<String> customHeaders;

    public Optional<Output<String>> customHeaders() {
        return Optional.ofNullable(this.customHeaders);
    }

    @Import(name="customRules")
    private @Nullable Output<List<AppCustomRuleArgs>> customRules;

    public Optional<Output<List<AppCustomRuleArgs>>> customRules() {
        return Optional.ofNullable(this.customRules);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="enableBranchAutoDeletion")
    private @Nullable Output<Boolean> enableBranchAutoDeletion;

    public Optional<Output<Boolean>> enableBranchAutoDeletion() {
        return Optional.ofNullable(this.enableBranchAutoDeletion);
    }

    @Import(name="environmentVariables")
    private @Nullable Output<List<AppEnvironmentVariableArgs>> environmentVariables;

    public Optional<Output<List<AppEnvironmentVariableArgs>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    @Import(name="iAMServiceRole")
    private @Nullable Output<String> iAMServiceRole;

    public Optional<Output<String>> iAMServiceRole() {
        return Optional.ofNullable(this.iAMServiceRole);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="oauthToken")
    private @Nullable Output<String> oauthToken;

    public Optional<Output<String>> oauthToken() {
        return Optional.ofNullable(this.oauthToken);
    }

    @Import(name="repository")
    private @Nullable Output<String> repository;

    public Optional<Output<String>> repository() {
        return Optional.ofNullable(this.repository);
    }

    @Import(name="tags")
    private @Nullable Output<List<AppTagArgs>> tags;

    public Optional<Output<List<AppTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AppArgs() {}

    private AppArgs(AppArgs $) {
        this.accessToken = $.accessToken;
        this.autoBranchCreationConfig = $.autoBranchCreationConfig;
        this.basicAuthConfig = $.basicAuthConfig;
        this.buildSpec = $.buildSpec;
        this.customHeaders = $.customHeaders;
        this.customRules = $.customRules;
        this.description = $.description;
        this.enableBranchAutoDeletion = $.enableBranchAutoDeletion;
        this.environmentVariables = $.environmentVariables;
        this.iAMServiceRole = $.iAMServiceRole;
        this.name = $.name;
        this.oauthToken = $.oauthToken;
        this.repository = $.repository;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppArgs $;

        public Builder() {
            $ = new AppArgs();
        }

        public Builder(AppArgs defaults) {
            $ = new AppArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessToken(@Nullable Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        public Builder autoBranchCreationConfig(@Nullable Output<AppAutoBranchCreationConfigArgs> autoBranchCreationConfig) {
            $.autoBranchCreationConfig = autoBranchCreationConfig;
            return this;
        }

        public Builder autoBranchCreationConfig(AppAutoBranchCreationConfigArgs autoBranchCreationConfig) {
            return autoBranchCreationConfig(Output.of(autoBranchCreationConfig));
        }

        public Builder basicAuthConfig(@Nullable Output<AppBasicAuthConfigArgs> basicAuthConfig) {
            $.basicAuthConfig = basicAuthConfig;
            return this;
        }

        public Builder basicAuthConfig(AppBasicAuthConfigArgs basicAuthConfig) {
            return basicAuthConfig(Output.of(basicAuthConfig));
        }

        public Builder buildSpec(@Nullable Output<String> buildSpec) {
            $.buildSpec = buildSpec;
            return this;
        }

        public Builder buildSpec(String buildSpec) {
            return buildSpec(Output.of(buildSpec));
        }

        public Builder customHeaders(@Nullable Output<String> customHeaders) {
            $.customHeaders = customHeaders;
            return this;
        }

        public Builder customHeaders(String customHeaders) {
            return customHeaders(Output.of(customHeaders));
        }

        public Builder customRules(@Nullable Output<List<AppCustomRuleArgs>> customRules) {
            $.customRules = customRules;
            return this;
        }

        public Builder customRules(List<AppCustomRuleArgs> customRules) {
            return customRules(Output.of(customRules));
        }

        public Builder customRules(AppCustomRuleArgs... customRules) {
            return customRules(List.of(customRules));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder enableBranchAutoDeletion(@Nullable Output<Boolean> enableBranchAutoDeletion) {
            $.enableBranchAutoDeletion = enableBranchAutoDeletion;
            return this;
        }

        public Builder enableBranchAutoDeletion(Boolean enableBranchAutoDeletion) {
            return enableBranchAutoDeletion(Output.of(enableBranchAutoDeletion));
        }

        public Builder environmentVariables(@Nullable Output<List<AppEnvironmentVariableArgs>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        public Builder environmentVariables(List<AppEnvironmentVariableArgs> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        public Builder environmentVariables(AppEnvironmentVariableArgs... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }

        public Builder iAMServiceRole(@Nullable Output<String> iAMServiceRole) {
            $.iAMServiceRole = iAMServiceRole;
            return this;
        }

        public Builder iAMServiceRole(String iAMServiceRole) {
            return iAMServiceRole(Output.of(iAMServiceRole));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder oauthToken(@Nullable Output<String> oauthToken) {
            $.oauthToken = oauthToken;
            return this;
        }

        public Builder oauthToken(String oauthToken) {
            return oauthToken(Output.of(oauthToken));
        }

        public Builder repository(@Nullable Output<String> repository) {
            $.repository = repository;
            return this;
        }

        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public Builder tags(@Nullable Output<List<AppTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<AppTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(AppTagArgs... tags) {
            return tags(List.of(tags));
        }

        public AppArgs build() {
            return $;
        }
    }

}
