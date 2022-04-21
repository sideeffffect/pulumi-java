// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final EventConnectionState Empty = new EventConnectionState();

    /**
     * The Amazon Resource Name (ARN) of the connection.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Parameters used for authorization. A maximum of 1 are allowed. Documented below.
     * 
     */
    @Import(name="authParameters")
    private @Nullable Output<EventConnectionAuthParametersGetArgs> authParameters;

    public Optional<Output<EventConnectionAuthParametersGetArgs>> authParameters() {
        return Optional.ofNullable(this.authParameters);
    }

    /**
     * Choose the type of authorization to use for the connection. One of `API_KEY`,`BASIC`,`OAUTH_CLIENT_CREDENTIALS`.
     * 
     */
    @Import(name="authorizationType")
    private @Nullable Output<String> authorizationType;

    public Optional<Output<String>> authorizationType() {
        return Optional.ofNullable(this.authorizationType);
    }

    /**
     * Enter a description for the connection. Maximum of 512 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the new connection. Maximum of 64 characters consisting of numbers, lower/upper case letters, .,-,_.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Amazon Resource Name (ARN) of the secret created from the authorization parameters specified for the connection.
     * 
     */
    @Import(name="secretArn")
    private @Nullable Output<String> secretArn;

    public Optional<Output<String>> secretArn() {
        return Optional.ofNullable(this.secretArn);
    }

    private EventConnectionState() {}

    private EventConnectionState(EventConnectionState $) {
        this.arn = $.arn;
        this.authParameters = $.authParameters;
        this.authorizationType = $.authorizationType;
        this.description = $.description;
        this.name = $.name;
        this.secretArn = $.secretArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventConnectionState $;

        public Builder() {
            $ = new EventConnectionState();
        }

        public Builder(EventConnectionState defaults) {
            $ = new EventConnectionState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder authParameters(@Nullable Output<EventConnectionAuthParametersGetArgs> authParameters) {
            $.authParameters = authParameters;
            return this;
        }

        public Builder authParameters(EventConnectionAuthParametersGetArgs authParameters) {
            return authParameters(Output.of(authParameters));
        }

        public Builder authorizationType(@Nullable Output<String> authorizationType) {
            $.authorizationType = authorizationType;
            return this;
        }

        public Builder authorizationType(String authorizationType) {
            return authorizationType(Output.of(authorizationType));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder secretArn(@Nullable Output<String> secretArn) {
            $.secretArn = secretArn;
            return this;
        }

        public Builder secretArn(String secretArn) {
            return secretArn(Output.of(secretArn));
        }

        public EventConnectionState build() {
            return $;
        }
    }

}
