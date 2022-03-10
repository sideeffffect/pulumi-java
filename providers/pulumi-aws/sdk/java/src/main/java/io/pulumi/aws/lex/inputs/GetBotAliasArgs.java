// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBotAliasArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBotAliasArgs Empty = new GetBotAliasArgs();

    /**
     * The name of the bot.
     * 
     */
    @InputImport(name="botName", required=true)
      private final String botName;

    public String getBotName() {
        return this.botName;
    }

    /**
     * The name of the bot alias. The name is case sensitive.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GetBotAliasArgs(
        String botName,
        String name) {
        this.botName = Objects.requireNonNull(botName, "expected parameter 'botName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetBotAliasArgs() {
        this.botName = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String botName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBotAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.botName = defaults.botName;
    	      this.name = defaults.name;
        }

        public Builder botName(String botName) {
            this.botName = Objects.requireNonNull(botName);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetBotAliasArgs build() {
            return new GetBotAliasArgs(botName, name);
        }
    }
}
