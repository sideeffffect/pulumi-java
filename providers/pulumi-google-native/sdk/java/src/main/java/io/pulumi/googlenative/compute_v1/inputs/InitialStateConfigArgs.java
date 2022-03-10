// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.FileContentBufferArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Initial State for shielded instance, these are public keys which are safe to store in public
 * 
 */
public final class InitialStateConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InitialStateConfigArgs Empty = new InitialStateConfigArgs();

    /**
     * The Key Database (db).
     * 
     */
    @InputImport(name="dbs")
      private final @Nullable Input<List<FileContentBufferArgs>> dbs;

    public Input<List<FileContentBufferArgs>> getDbs() {
        return this.dbs == null ? Input.empty() : this.dbs;
    }

    /**
     * The forbidden key database (dbx).
     * 
     */
    @InputImport(name="dbxs")
      private final @Nullable Input<List<FileContentBufferArgs>> dbxs;

    public Input<List<FileContentBufferArgs>> getDbxs() {
        return this.dbxs == null ? Input.empty() : this.dbxs;
    }

    /**
     * The Key Exchange Key (KEK).
     * 
     */
    @InputImport(name="keks")
      private final @Nullable Input<List<FileContentBufferArgs>> keks;

    public Input<List<FileContentBufferArgs>> getKeks() {
        return this.keks == null ? Input.empty() : this.keks;
    }

    /**
     * The Platform Key (PK).
     * 
     */
    @InputImport(name="pk")
      private final @Nullable Input<FileContentBufferArgs> pk;

    public Input<FileContentBufferArgs> getPk() {
        return this.pk == null ? Input.empty() : this.pk;
    }

    public InitialStateConfigArgs(
        @Nullable Input<List<FileContentBufferArgs>> dbs,
        @Nullable Input<List<FileContentBufferArgs>> dbxs,
        @Nullable Input<List<FileContentBufferArgs>> keks,
        @Nullable Input<FileContentBufferArgs> pk) {
        this.dbs = dbs;
        this.dbxs = dbxs;
        this.keks = keks;
        this.pk = pk;
    }

    private InitialStateConfigArgs() {
        this.dbs = Input.empty();
        this.dbxs = Input.empty();
        this.keks = Input.empty();
        this.pk = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InitialStateConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FileContentBufferArgs>> dbs;
        private @Nullable Input<List<FileContentBufferArgs>> dbxs;
        private @Nullable Input<List<FileContentBufferArgs>> keks;
        private @Nullable Input<FileContentBufferArgs> pk;

        public Builder() {
    	      // Empty
        }

        public Builder(InitialStateConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbs = defaults.dbs;
    	      this.dbxs = defaults.dbxs;
    	      this.keks = defaults.keks;
    	      this.pk = defaults.pk;
        }

        public Builder dbs(@Nullable Input<List<FileContentBufferArgs>> dbs) {
            this.dbs = dbs;
            return this;
        }

        public Builder dbs(@Nullable List<FileContentBufferArgs> dbs) {
            this.dbs = Input.ofNullable(dbs);
            return this;
        }

        public Builder dbxs(@Nullable Input<List<FileContentBufferArgs>> dbxs) {
            this.dbxs = dbxs;
            return this;
        }

        public Builder dbxs(@Nullable List<FileContentBufferArgs> dbxs) {
            this.dbxs = Input.ofNullable(dbxs);
            return this;
        }

        public Builder keks(@Nullable Input<List<FileContentBufferArgs>> keks) {
            this.keks = keks;
            return this;
        }

        public Builder keks(@Nullable List<FileContentBufferArgs> keks) {
            this.keks = Input.ofNullable(keks);
            return this;
        }

        public Builder pk(@Nullable Input<FileContentBufferArgs> pk) {
            this.pk = pk;
            return this;
        }

        public Builder pk(@Nullable FileContentBufferArgs pk) {
            this.pk = Input.ofNullable(pk);
            return this;
        }
        public InitialStateConfigArgs build() {
            return new InitialStateConfigArgs(dbs, dbxs, keks, pk);
        }
    }
}
