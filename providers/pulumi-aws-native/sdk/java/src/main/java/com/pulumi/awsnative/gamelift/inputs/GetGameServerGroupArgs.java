// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.gamelift.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetGameServerGroupArgs extends InvokeArgs {

    public static final GetGameServerGroupArgs Empty = new GetGameServerGroupArgs();

    /**
     * A generated unique ID for the game server group.
     * 
     */
    @Import(name="gameServerGroupArn", required=true)
    private String gameServerGroupArn;

    /**
     * @return A generated unique ID for the game server group.
     * 
     */
    public String gameServerGroupArn() {
        return this.gameServerGroupArn;
    }

    private GetGameServerGroupArgs() {}

    private GetGameServerGroupArgs(GetGameServerGroupArgs $) {
        this.gameServerGroupArn = $.gameServerGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGameServerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGameServerGroupArgs $;

        public Builder() {
            $ = new GetGameServerGroupArgs();
        }

        public Builder(GetGameServerGroupArgs defaults) {
            $ = new GetGameServerGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gameServerGroupArn A generated unique ID for the game server group.
         * 
         * @return builder
         * 
         */
        public Builder gameServerGroupArn(String gameServerGroupArn) {
            $.gameServerGroupArn = gameServerGroupArn;
            return this;
        }

        public GetGameServerGroupArgs build() {
            $.gameServerGroupArn = Objects.requireNonNull($.gameServerGroupArn, "expected parameter 'gameServerGroupArn' to be non-null");
            return $;
        }
    }

}
