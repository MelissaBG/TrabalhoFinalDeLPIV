package trabalhofinaldelpiv.home.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J#\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Ltrabalhofinaldelpiv/home/data/repository/ListCharacterRepository;", "", "()V", "localDatasource", "Ltrabalhofinaldelpiv/home/data/ListCharacterLocalDataSource;", "getLocalDatasource", "()Ltrabalhofinaldelpiv/home/data/ListCharacterLocalDataSource;", "localDatasource$delegate", "Lkotlin/Lazy;", "remoteListCharacterDatasource", "Ltrabalhofinaldelpiv/home/data/ListCharacaterRemoteDataSource;", "getRemoteListCharacterDatasource", "()Ltrabalhofinaldelpiv/home/data/ListCharacaterRemoteDataSource;", "remoteListCharacterDatasource$delegate", "list", "Ltrabalhofinaldelpiv/webservice/Result;", "", "Ltrabalhofinaldelpiv/home/data/CharacterResponse;", "Ltrabalhofinaldelpiv/home/domain/ErrorModelListCharacter;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "characterRequest", "Ltrabalhofinaldelpiv/character/newCharacter/data/CharacterRequest;", "(Ltrabalhofinaldelpiv/character/newCharacter/data/CharacterRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ListCharacterRepository {
    private final kotlin.Lazy remoteListCharacterDatasource$delegate = null;
    private final kotlin.Lazy localDatasource$delegate = null;
    
    public ListCharacterRepository() {
        super();
    }
    
    private final trabalhofinaldelpiv.home.data.ListCharacaterRemoteDataSource getRemoteListCharacterDatasource() {
        return null;
    }
    
    private final trabalhofinaldelpiv.home.data.ListCharacterLocalDataSource getLocalDatasource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object save(@org.jetbrains.annotations.NotNull()
    trabalhofinaldelpiv.character.newCharacter.data.CharacterRequest characterRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super trabalhofinaldelpiv.webservice.Result<kotlin.Unit, ? extends trabalhofinaldelpiv.home.domain.ErrorModelListCharacter>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object list(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super trabalhofinaldelpiv.webservice.Result<? extends java.util.List<trabalhofinaldelpiv.home.data.CharacterResponse>, ? extends trabalhofinaldelpiv.home.domain.ErrorModelListCharacter>> continuation) {
        return null;
    }
}