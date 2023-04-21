package trabalhofinaldelpiv.home.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ+\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ-\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Ltrabalhofinaldelpiv/home/data/ListCharacaterRemoteDataSource;", "", "()V", "characterResponse", "", "Ltrabalhofinaldelpiv/home/data/CharacterResponse;", "service", "Ltrabalhofinaldelpiv/home/data/ListCharacterApi;", "kotlin.jvm.PlatformType", "deleteCharacter", "Ltrabalhofinaldelpiv/webservice/Result;", "", "Ltrabalhofinaldelpiv/home/domain/ErrorModelListCharacter;", "userId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listCharacter", "", "saveCharacter", "characterRequest", "Ltrabalhofinaldelpiv/home/data/CharacterRequest;", "(Ltrabalhofinaldelpiv/home/data/CharacterRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ListCharacaterRemoteDataSource {
    private final trabalhofinaldelpiv.home.data.ListCharacterApi service = null;
    private final java.util.List<trabalhofinaldelpiv.home.data.CharacterResponse> characterResponse = null;
    
    public ListCharacaterRemoteDataSource() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveCharacter(@org.jetbrains.annotations.NotNull()
    trabalhofinaldelpiv.home.data.CharacterRequest characterRequest, int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super trabalhofinaldelpiv.webservice.Result<kotlin.Unit, ? extends trabalhofinaldelpiv.home.domain.ErrorModelListCharacter>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object listCharacter(int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super trabalhofinaldelpiv.webservice.Result<? extends java.util.List<trabalhofinaldelpiv.home.data.CharacterResponse>, ? extends trabalhofinaldelpiv.home.domain.ErrorModelListCharacter>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteCharacter(int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super trabalhofinaldelpiv.webservice.Result<kotlin.Unit, ? extends trabalhofinaldelpiv.home.domain.ErrorModelListCharacter>> continuation) {
        return null;
    }
}