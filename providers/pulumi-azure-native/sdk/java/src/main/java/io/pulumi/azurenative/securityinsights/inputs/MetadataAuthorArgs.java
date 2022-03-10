// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Publisher or creator of the content item.
 * 
 */
public final class MetadataAuthorArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataAuthorArgs Empty = new MetadataAuthorArgs();

    /**
     * Email of author contact
     * 
     */
    @InputImport(name="email")
      private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    /**
     * Link for author/vendor page
     * 
     */
    @InputImport(name="link")
      private final @Nullable Input<String> link;

    public Input<String> getLink() {
        return this.link == null ? Input.empty() : this.link;
    }

    /**
     * Name of the author. Company or person.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public MetadataAuthorArgs(
        @Nullable Input<String> email,
        @Nullable Input<String> link,
        @Nullable Input<String> name) {
        this.email = email;
        this.link = link;
        this.name = name;
    }

    private MetadataAuthorArgs() {
        this.email = Input.empty();
        this.link = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataAuthorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> email;
        private @Nullable Input<String> link;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataAuthorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.link = defaults.link;
    	      this.name = defaults.name;
        }

        public Builder email(@Nullable Input<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(@Nullable String email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder link(@Nullable Input<String> link) {
            this.link = link;
            return this;
        }

        public Builder link(@Nullable String link) {
            this.link = Input.ofNullable(link);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public MetadataAuthorArgs build() {
            return new MetadataAuthorArgs(email, link, name);
        }
    }
}
