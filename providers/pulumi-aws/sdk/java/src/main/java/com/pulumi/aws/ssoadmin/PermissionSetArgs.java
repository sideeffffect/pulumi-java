// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssoadmin;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PermissionSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PermissionSetArgs Empty = new PermissionSetArgs();

    /**
     * The description of the Permission Set.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    @Import(name="instanceArn", required=true)
    private Output<String> instanceArn;

    public Output<String> instanceArn() {
        return this.instanceArn;
    }

    /**
     * The name of the Permission Set.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The relay state URL used to redirect users within the application during the federation authentication process.
     * 
     */
    @Import(name="relayState")
    private @Nullable Output<String> relayState;

    public Optional<Output<String>> relayState() {
        return Optional.ofNullable(this.relayState);
    }

    /**
     * The length of time that the application user sessions are valid in the ISO-8601 standard. Default: `PT1H`.
     * 
     */
    @Import(name="sessionDuration")
    private @Nullable Output<String> sessionDuration;

    public Optional<Output<String>> sessionDuration() {
        return Optional.ofNullable(this.sessionDuration);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PermissionSetArgs() {}

    private PermissionSetArgs(PermissionSetArgs $) {
        this.description = $.description;
        this.instanceArn = $.instanceArn;
        this.name = $.name;
        this.relayState = $.relayState;
        this.sessionDuration = $.sessionDuration;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PermissionSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PermissionSetArgs $;

        public Builder() {
            $ = new PermissionSetArgs();
        }

        public Builder(PermissionSetArgs defaults) {
            $ = new PermissionSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder instanceArn(Output<String> instanceArn) {
            $.instanceArn = instanceArn;
            return this;
        }

        public Builder instanceArn(String instanceArn) {
            return instanceArn(Output.of(instanceArn));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder relayState(@Nullable Output<String> relayState) {
            $.relayState = relayState;
            return this;
        }

        public Builder relayState(String relayState) {
            return relayState(Output.of(relayState));
        }

        public Builder sessionDuration(@Nullable Output<String> sessionDuration) {
            $.sessionDuration = sessionDuration;
            return this;
        }

        public Builder sessionDuration(String sessionDuration) {
            return sessionDuration(Output.of(sessionDuration));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public PermissionSetArgs build() {
            $.instanceArn = Objects.requireNonNull($.instanceArn, "expected parameter 'instanceArn' to be non-null");
            return $;
        }
    }

}
