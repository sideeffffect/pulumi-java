// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.inputs;

import com.pulumi.azurenative.webpubsub.enums.WebPubSubRequestType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ACL for a private endpoint
 * 
 */
public final class PrivateEndpointACLArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointACLArgs Empty = new PrivateEndpointACLArgs();

    /**
     * Allowed request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    @Import(name="allow")
    private @Nullable Output<List<Either<String,WebPubSubRequestType>>> allow;

    public Optional<Output<List<Either<String,WebPubSubRequestType>>>> allow() {
        return Optional.ofNullable(this.allow);
    }

    /**
     * Denied request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    @Import(name="deny")
    private @Nullable Output<List<Either<String,WebPubSubRequestType>>> deny;

    public Optional<Output<List<Either<String,WebPubSubRequestType>>>> deny() {
        return Optional.ofNullable(this.deny);
    }

    /**
     * Name of the private endpoint connection
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private PrivateEndpointACLArgs() {}

    private PrivateEndpointACLArgs(PrivateEndpointACLArgs $) {
        this.allow = $.allow;
        this.deny = $.deny;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointACLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointACLArgs $;

        public Builder() {
            $ = new PrivateEndpointACLArgs();
        }

        public Builder(PrivateEndpointACLArgs defaults) {
            $ = new PrivateEndpointACLArgs(Objects.requireNonNull(defaults));
        }

        public Builder allow(@Nullable Output<List<Either<String,WebPubSubRequestType>>> allow) {
            $.allow = allow;
            return this;
        }

        public Builder allow(List<Either<String,WebPubSubRequestType>> allow) {
            return allow(Output.of(allow));
        }

        public Builder allow(Either<String,WebPubSubRequestType>... allow) {
            return allow(List.of(allow));
        }

        public Builder deny(@Nullable Output<List<Either<String,WebPubSubRequestType>>> deny) {
            $.deny = deny;
            return this;
        }

        public Builder deny(List<Either<String,WebPubSubRequestType>> deny) {
            return deny(Output.of(deny));
        }

        public Builder deny(Either<String,WebPubSubRequestType>... deny) {
            return deny(List.of(deny));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public PrivateEndpointACLArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
